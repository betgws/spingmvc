package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());  Slf4j가 이코드를 대신 넣어줌

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";

        System.out.println("name=" +name);

        log.trace("trace log={}",name);
        log.debug("debug log{}=",name);
        log.info("info log={}", name);
        log.warn("info warn={}", name);
        log.error("info error={}", name);

        return "ok";
    }
}
