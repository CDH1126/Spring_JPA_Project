package idusw.springboot.board.service;

import idusw.springboot.board.domain.BoardDTO;
import idusw.springboot.board.domain.PageRequestDTO;
import idusw.springboot.board.domain.PageResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @RequiredArgsConstructor
public class ServiceBoardImpl implements BoardService {
    private final BoardService boardService;
    @Autowired
    public ServiceBoardImpl(BoardService boardService) {
        this.boardService = boardService; // @RequiredArgsConstructor 를 직접 구현
    }

    @Override
    public Long create(BoardDTO dto) {
        return 0L;
    }

    @Override
    public PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO) {
        return null;
    }

    @Override
    public BoardDTO getById(Long bno) {
        return null;
    }

    @Override
    public Long modify(BoardDTO dto) {
        return 0L;
    }

    @Override
    public void update(BoardDTO board) {

    }

    @Override
    public void delete(BoardDTO board) {

    }

    @Override
    public int updateView(Long bno) {
        return 0;
    }
}
