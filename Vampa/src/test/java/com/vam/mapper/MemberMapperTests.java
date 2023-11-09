package com.vam.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper memberMapper;
/*	
	@Test
	public void memberJoin() throws Exception {
		MemberVO member = new MemberVO();
		
		member.setMemberId("spring_test53");
		member.setMemberPw("spring_test2");
		member.setMemberName("spring_test2");
		member.setMemberMail("spring_test2");
		member.setMemberAddr1("spring_test1");
		member.setMemberAddr2("spring_test2");
		member.setMemberAddr3("spring_test3");
		
		memberMapper.memberJoin(member);
	}
*/
/*
 * // 아이디 중복검사
 * 
 * @Test public void memberIdChk() throws Exception { String id = "spring1";
 * String id2 = "test123"; memberMapper.idCheck(id); memberMapper.idCheck(id2);
 * }
 */
	
	// 로그인 쿼리 mapper 메서드 테스트
	@Test
	public void memberLogin() throws Exception {
		MemberVO member = new MemberVO();
		
		// 올바른 아이디 비번 입력경우
		// member.setMemberId("spring1");
		// member.setMemberPw("spring1");
		
		// 올바르지 않은 아이디 비번 입력경우
		 member.setMemberId("test123213");
		 member.setMemberPw("spring123123");
		
		memberMapper.memberLogin(member);
		System.out.println("결과 값: " + memberMapper.memberLogin(member));
	}

}
