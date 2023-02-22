package labshopoauthkeycloak.common;


import labshopoauthkeycloak.OderApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OderApplication.class })
public class CucumberSpingConfiguration {
    
}
