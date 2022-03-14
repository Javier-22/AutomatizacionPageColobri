package block_validation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static block_validation.userinterface.SelectFormPage.*;

public class SeleForm implements Task {
    public static SeleForm fv(){
        return  Tasks.instrumented(SeleForm.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECTFORMONE),
                Click.on(SELECTFORMVALI)

        );

    }
}
