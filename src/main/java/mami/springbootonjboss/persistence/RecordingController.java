package mami.springbootonjboss.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RecordingController {

    private Logger logger = LoggerFactory.getLogger(RecordingController.class);

    @Autowired
    RecordingRestRepository repository;

    @RequestMapping(method = RequestMethod.GET, value = "/recordings", produces = "application/json")
    @ResponseBody
    public String all() {
        try {
            List<Recording> all = repository.findAll();
            System.out.println("all: "+all);
            logger.info("ALL: "+all);
            return HttpStatus.OK.toString();
        } catch(Exception e){
            return e.getMessage();
        }

    }
}
