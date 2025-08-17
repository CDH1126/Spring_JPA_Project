package idusw.springboot.board.service;

import idusw.springboot.board.domain.BoardDTO;
import idusw.springboot.board.domain.PageRequestDTO;
import idusw.springboot.board.domain.PageResultDTO;
import idusw.springboot.board.entity.BoardEntity;
import idusw.springboot.board.entity.MemberEntity;

public interface BoardService {

    Long create(BoardDTO dto);   //Board : DTO or Domain
    PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);

    BoardDTO getById(Long bno);    //Id는 primary Key 값 @ID
    Long modify(BoardDTO dto);

    void update(BoardDTO board);

    void delete(BoardDTO board);

    int updateView(Long bno);

    default BoardEntity dtoToEntity(BoardDTO dto) {

        MemberEntity member = MemberEntity.builder()
                .mno(dto.getWriterMno())
                .build();

        BoardEntity board = BoardEntity.builder()
                .bno(dto.getBno())
                .title(dto.getTitle())
                .block(dto.getBlock())
                .content(dto.getContent())
                .views(dto.getViews())
                .writer(member)
                .build();

        return board;
    }

    default BoardDTO entityToDto(BoardEntity entity, MemberEntity member, Long replayCount) {
        BoardDTO dto = BoardDTO.builder()
                .bno(entity.getBno())
                .title(entity.getTitle())
                .views(entity.getViews())
                .block(entity.getBlock())
                .content(entity.getContent())
                .writerMno(member.getMno())
                .writerId(member.getId())
                .writerName(member.getName())
                .writerEmail(member.getEmail())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .replyCount(replayCount.intValue())
                .build();

        return dto;
    }


}
