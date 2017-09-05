package mami.springbootonjboss;

import mami.springbootonjboss.persistence.RecordingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloWorldController {

    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "application/json")
    @ResponseBody
    public String helloWorld() {
        System.out.println("MAMI: HELLO WORLD SYSTEM.OUT.PRINTLN");

        logger.info("MAMI: HELLO WORLD SLF4J : INFO");
        logger.warn("MAMI: HELLO WORLD SLF4J : WARN");
        logger.error("MAMI: HELLO WORLD SLF4J : ERROR");
        logger.debug("MAMI: HELLO WORLD SLF4J : DEBUG");
        logger.trace("MAMI: HELLO WORLD SLF4J : TRACE");

        return "Hello World MaMi";
    }


    @Autowired
    RecordingController recording;

    @Scheduled(fixedRate = 10000L)
    public void sync() {
        logger.info("SYNC ....");
        recording.all();
    }


}
