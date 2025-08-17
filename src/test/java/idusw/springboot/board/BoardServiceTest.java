package idusw.springboot.board;

import idusw.springboot.board.domain.BoardDTO;
import idusw.springboot.board.domain.PageRequestDTO;
import idusw.springboot.board.domain.PageResultDTO;
import idusw.springboot.board.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Test
    public void registerTest() {
        IntStream.rangeClosed(1, 47).forEach(i -> {
            BoardDTO dto = BoardDTO.builder()
                    .title("Test")
                    .content("content")
                    .writerMno((Long.valueOf("" + i)))
                    .block("unblock")
                    .build();

            Long bno = boardService.create(dto);
        });
    }

    @Test
    public void listTest() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(5)
                .build();
        pageRequestDTO.setPage(1);
        PageResultDTO<BoardDTO, Object[]> result = boardService.getList(pageRequestDTO);

        for (BoardDTO dto : result.getDtoList()) {
            System.out.println("board list : " + dto.toString());
        }
    }
}
