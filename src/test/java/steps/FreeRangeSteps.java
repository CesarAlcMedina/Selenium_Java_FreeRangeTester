package steps;
import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;
import pages.PaginasFundamentosTesting;
import java.util.List;

import org.testng.Assert;

import java.util.Arrays;

public class FreeRangeSteps {
        PaginaPrincipal LandingPage = new PaginaPrincipal();
        PaginaCursos cursosPage = new PaginaCursos();
        PaginasFundamentosTesting  fundamentosPage = new PaginasFundamentosTesting();
        PaginaRegistro registro = new PaginaRegistro(); 

        @Given("I navigate to www.freerangetester.com")
        public void iNavigateToFRT(){
            LandingPage.navigateToFreeRangeTesters();
        }

        @When("I go to {word} using the navigation bar")
        public void navigationBarUse(String section){
            LandingPage.clickOnSectionNavigationBar(section);
        }

         @When("I go to Elegir plan")
        public void goElegirPlan(){
            LandingPage.clickOneElegirPlanButton();
        }
        @And("Select Introducción al Testing")
        public void navigateToIntro(){
            //cursosPage.clickFundamentosTestingLink();
            fundamentosPage.clickIntroduccionTestingLink();
        }
        @Then("I can validate the options in  the checkout page")
        public void validateCheckoutPlans(){
            List<String> Lista = registro.returnPlanDropdownValues();
            List<String> ListaEsperada =  Arrays.asList("Plan Mensual", "Plan Trimestral", "Plan Semestral", "Plan Anual");

            Assert.assertEquals(Lista, ListaEsperada);
        }

}
