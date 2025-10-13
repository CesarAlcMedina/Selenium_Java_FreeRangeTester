package pages;

public class PaginasFundamentosTesting extends BasePage{

    private String introduccionTestingLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public PaginasFundamentosTesting(){
        super(driver);
    }

    public void clickIntroduccionTestingLink(){
        clickElement(introduccionTestingLink);
    }
    
}
