package Example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple {
    @RequestMapping("/test1")
    public String getString(){
        return "1";
    }
}
