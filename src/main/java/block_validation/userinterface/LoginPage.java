package block_validation.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
public static final Target USERNAME = Target.the("Name").located(By.xpath("//div[@class='tab-pane active']//input[@placeholder='Username']"));
public static final Target PASSWORD = Target.the("Password").located(By.xpath("//div[@class='tab-pane active']//input[@placeholder='Password']"));
public static final Target BUTTON= Target.the("Button nex").located(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
}
