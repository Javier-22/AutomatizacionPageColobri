package block_validation.tasks;

import block_validation.model.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static block_validation.userinterface.LoginPage.*;

public class Login implements Task {
    private List<LoginData> ld;
public Login (List<LoginData> ld) {this.ld=ld;
}
public static Login ldo(List<LoginData> ld){ return Tasks.instrumented(Login.class,ld);}

    @Override
    public <T extends Actor> void performAs(T actor) {
   actor.attemptsTo(
           Enter.theValue(ld.get(0).getStrUsername()).into(USERNAME),
           Enter.theValue(ld.get(0).getStrPassword()).into(PASSWORD),
           Click.on(BUTTON));


    }
}
