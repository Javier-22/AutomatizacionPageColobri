package block_validation.tasks;

import block_validation.model.FormData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static block_validation.userinterface.FormPage.*;

public class Form implements Task {
    private List<FormData> fd;
    public  Form (List<FormData> fd) { this.fd=fd;}
    public static Form df(List<FormData> fd){
        return Tasks.instrumented(Form.class, fd);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(fd.get(0).getStrRequired()).into(REQUIREDFIELD),
                Enter.theValue(fd.get(0).getStrEmail()).into(EMAIL),
                Enter.theValue((fd.get(0).getStrPassword())).into(PASSWORD),
                Enter.theValue(fd.get(0).getStrConfirmPassword()).into(CONFIRMPASSWORD),
                Enter.theValue(fd.get(0).getStrDate()).into(DATE),
                Enter.theValue(fd.get(0).getStrUrl()).into(URL),
                Enter.theValue(fd.get(0).getStrDigitsOnly()).into(DIGITS),
                Enter.theValue(fd.get(0).getStrRange()).into(Range),
                Click.on(CHECK_TERMS)





        );


    }
}
