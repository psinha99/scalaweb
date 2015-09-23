package misc

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration

/**
 * @author purnendu
 */

object SampleApplication extends App {
    SpringApplication.run(classOf[SampleConfiguration]);  
}    

@Configuration
@EnableAutoConfiguration
@ComponentScan
class SampleConfiguration {


}