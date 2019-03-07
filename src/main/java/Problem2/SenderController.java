package Problem2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SenderController {

    @GetMapping("/")
        public ModelAndView index(){
                Map<String, String> model = new HashMap<>();
                model.put("name", "Aibek");
                return new ModelAndView("index", model);
    }
}
