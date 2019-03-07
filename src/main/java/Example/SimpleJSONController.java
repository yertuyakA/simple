package Example;
/** Закинуть на гитхаб*/
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class SimpleJSONController {
    private static Logger log = Logger.getLogger("");


    @GetMapping("/simpleJSON")
    @ResponseBody
    public List<SimpleJSON> getSimpleJSON(){
//        return new SimpleJSON("simple", "1.0");
        List<SimpleJSON> s = new ArrayList<>();
        s.add(new SimpleJSON("A1","2"));
        s.add(new SimpleJSON("A2","2"));
        s.add(new SimpleJSON("A3","3"));
        s.add(new SimpleJSON("A4","4"));
        return s;
    }


  @RequestMapping("/show")
  ResponseEntity<SimpleJSON> showJSON(){
      return new ResponseEntity<SimpleJSON>(new SimpleJSON("sds", "dsd"), HttpStatus.OK);
  }




  ResponseEntity formatMessage(String code, String message, HttpStatus status) {
        if (status.is4xxClientError()) {
            log.severe(message);
        } else {
            log.info(message);
        }
        return ResponseEntity.status(status).contentType(MediaType.APPLICATION_JSON_UTF8).body(String.format("{\"message\":\"%s - %s\"}",code, message));
  }
}
