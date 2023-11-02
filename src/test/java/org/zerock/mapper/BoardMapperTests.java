package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//테스트 코드에서 RunWith과 ContextConfiguration은 함께 사용한다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_= @Autowired)
	private BoardMapper mapper; //BoardMapperTests 클래스는 스프링을 이용해서 BoardMapper 인터페이스의 구현체를 주입받아 동작하게 함 
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
}
