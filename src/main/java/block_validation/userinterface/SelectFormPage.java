package block_validation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.net.PortUnreachableException;

public class SelectFormPage {
    public static final Target SELECTFORMONE=Target.the("Select Form").located(By.xpath("//i[@class='fa fa-pencil']"));
    public static final Target SELECTFORMVALI= Target.the("Select validation form").located(By.xpath("//a[@href='form-validation.html']//i"));
}
