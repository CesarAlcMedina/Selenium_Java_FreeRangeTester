package pages;
import java.util.List;
public class PaginaRegistro extends BasePage {

    private String planDropdown = "//select[@id='formBasicSelect']";

    public PaginaRegistro(){
        super(driver);
    }

    public List<String> returnPlanDropdownValues(){
        return getDropdownValues(planDropdown);
        
    }
    
}
