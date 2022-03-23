package co.micol.prj;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.micol.prj.member.mapper.MemberMapper;
import co.micol.prj.member.service.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/*-context.xml")
public class MemberMapperClient {
	
	@Autowired MemberMapper mapper;
	//@Test
	public void listTest() {
		List<MemberVO> list = mapper.memberSelectAll();
		System.out.println(list);
	}
	//@Test
	/*
	 * public void selectTest() { MemberVO vo = new MemberVO(); vo.setId("hong"); vo
	 * = mapper.memberSelectOne(vo); }
	 */
	
	@Test
	public void insertTest() {
		MemberVO vo = new MemberVO();
		vo.setId("hong13");
		vo.setPassword("1234");
		vo.setName("홍길동");
		vo.setAddress("대구시");
		vo.setTel("1234");
		int n = mapper.memberInsert(vo);
		assertEquals(n, 1);
	}
}
