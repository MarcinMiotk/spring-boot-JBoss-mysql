package mami.springbootonjboss;

import mami.springbootonjboss.persistence.RecordingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@EnableScheduling
public class SpringBootOnJbossApplicationTests {

	@Autowired
	RecordingController controller;

	@Test
	public void contextLoads() {
		controller.all();
	}

}
