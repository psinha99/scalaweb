package misc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class JavaBasedController {

    @RequestMapping("/show")
    public String show() {
        return "Show called from JavaBasedController";
    }

}