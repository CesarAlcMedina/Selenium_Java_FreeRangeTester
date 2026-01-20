package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/resources", //Este es el directorio de nuestros archivos .feature
    glue="steps",
    plugin= {"pretty", "html:target/cucumber-reports"}, tags ="@Navigation" //Este es el paquete donde se encuentran nuestros step definitions
)

public class TestRunner { 
    
        @AfterClass
        public static void cleanDriver(){
            BasePage.closeBrowser();
        }

}
