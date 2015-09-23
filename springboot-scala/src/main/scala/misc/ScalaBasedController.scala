package misc

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author purnendu
 */
@RestController
@RequestMapping(Array("/scala"))
class ScalaBasedController {
    @RequestMapping(Array("/show"))
    def show =  {
        "Show called from Scala based Controller";
    }
    
   
}