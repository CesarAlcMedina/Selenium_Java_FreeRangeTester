package pages;
import java.util.List;
public class PaginaRegistro extends BasePage {

    private String planDropdown = "//label[@for='cart_cart_items_attributes_0_offer_id_4165082']";

    public PaginaRegistro(){
        super(driver);
    }

    public List<String> returnPlanDropdownValues(){
        return getDropdownValues(planDropdown);
        
    }
    
}
