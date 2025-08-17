package idusw.springboot.board.repository;

import idusw.springboot.board.entity.BoardEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchBoardRepository {

    BoardEntity searchBoard();

    Page<Object[]> searchPage(String type, String keyword, Pageable pageable);
}
