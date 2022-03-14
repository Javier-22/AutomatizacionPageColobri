package block_validation.userinterface;

import com.vladsch.flexmark.util.sequence.TagRange;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class FormPage {
    public static final Target  REQUIREDFIELD = Target.the("Required Field").located(By.xpath("//input[@id='required2']"));
    public static final Target EMAIL = Target.the("User email").located(By.xpath("//input[@id='email2']"));
    public static final Target PASSWORD =Target.the("type password user").located(By.xpath("//input[@id='password2']"));
    public static final Target CONFIRMPASSWORD= Target.the("The user confirms  the entered password").located(By.xpath("//input[@id='confirm_password2']"));
    public static final Target DATE =Target.the("Enter the date").located(By.xpath("//input[@id='date2']"));
    public static final Target URL =Target.the("Enter the url").located(By.xpath("//input[@id='url2']"));
    public static final Target DIGITS=Target.the("Enter the Digits only").located(By.xpath("//input[@id='digits']"));
    public static final Target Range=Target.the("Enter the range").located(By.xpath("//input[@id='range']"));
    public static final Target CHECK_TERMS=Target.the("accept security policies").located(By.xpath("//input[@id='agree2']"));
    public static final Target BUTTONVALIDATION=Target.the  ("Check validate button").located(By.xpath("//form[@id='block-validate']//div[@class='form-actions no-margin-bottom']//input"));

}
