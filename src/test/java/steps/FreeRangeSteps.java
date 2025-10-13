package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaPrincipal;
import pages.PaginasFundamentosTesting;

public class FreeRangeSteps {
        PaginaPrincipal LandingPage = new PaginaPrincipal();
        PaginaCursos cursosPage = new PaginaCursos();
        PaginasFundamentosTesting  fundamentosPage = new PaginasFundamentosTesting();

        @Given("I navigate to wwww.freerangetester.com")
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
        public void navigateTiIntro(){
            //cursosPage.clickFundamentosTestingLink();
            fundamentosPage.clickIntroduccionTestingLink();

        }

}
