package idusw.springboot.board;

import idusw.springboot.board.domain.BoardDTO;
import idusw.springboot.board.domain.MemberDTO;
import idusw.springboot.board.entity.MemberEntity;
import idusw.springboot.board.repository.MemberRepository;
import idusw.springboot.board.service.BoardService;
import idusw.springboot.board.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class MemberServiceTests {

	//POJO (Plain Old Java Object) : 가장 기본적인 자바 객체 형태 - 필드, getter, setter
	//Beans 규약을 준수, 생성자가 복잡하지 않음.
	//DI(Dependency Injection) : 의존성 주입, Spring Framework 가 의존성을 해결하는 방법
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	MemberService memberService;
	@Autowired
	BoardService boardService;


	@Test
	void testInitialize() {
		// Integer 데이터 흐름, Lambda 식 - 함수형 언어의 특징을 활용
		IntStream.rangeClosed(1, 50).forEach(i -> {
			MemberDTO memberDTO = MemberDTO.builder()
					.id("id-" + i)
					.pw("pw" + i)
					.name("name-" + i)
					.email("email" + i)
					.build();
			memberService.create(memberDTO);

			/*
			MemberEntity member = MemberEntity.builder()
					.id("id-" + i)
					.pw("pw" + i)
					.name("name-" + i)
					.email("email-" + i)
					.maccess("access")
					.build();
			memberRepository.save(member);
			 */
		});

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

}
