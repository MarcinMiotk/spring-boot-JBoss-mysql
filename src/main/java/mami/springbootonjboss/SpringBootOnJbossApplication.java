package mami.springbootonjboss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootOnJbossApplication extends SpringBootServletInitializer {


	private Logger logger = LoggerFactory.getLogger(SpringBootOnJbossApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOnJbossApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		System.out.println("MAMI: HELLO WORLD CONFIGURE");

		logger.info("MAMI: HELLO WORLD SLF4J CONFIGURE: INFO");
		logger.warn("MAMI: HELLO WORLD SLF4J CONFIGURE: WARN");
		logger.error("MAMI: HELLO WORLD SLF4J CONFIGURE: ERROR");
		logger.debug("MAMI: HELLO WORLD SLF4J CONFIGURE: DEBUG");
		logger.trace("MAMI: HELLO WORLD SLF4J CONFIGURE: TRACE");

		return application.sources(applicationClass);
	}

	private static Class<SpringBootOnJbossApplication> applicationClass = SpringBootOnJbossApplication.class;
}
