package pages;

public class PaginaPrincipal extends BasePage {



    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public PaginaPrincipal(){
        super(driver);
    }
    //método para navegar a www.freerangetesters.com

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com/");
        //clickElement(searchButtom);
    }

    public void clickOnSectionNavigationBar(String section){
        // Remplazar el marcador de posicion %s por el valor de section 
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOneElegirPlanButton(){
        clickElement(elegirUnPlanButton);
    }
    
}
