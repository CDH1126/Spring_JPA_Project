package idusw.springboot.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "a_reply")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board")
public class ReplyEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ab_reply_seq_gen")
    //@SequenceGenerator(sequenceName = "ab_reply_seq", name = "ab_reply_seq_gen", allocationSize = 1)
    private Long rno;

    private String text;
    private String replier; 

    @ManyToOne
    private BoardEntity board;  //연관 관계 지정
}
