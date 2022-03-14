package block_validation.questions;

import block_validation.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Answer implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resp;
        if (FormPage.BUTTONVALIDATION.resolveFor(actor).isClickable()){
            resp = true;
        }else{
            resp = false;
        }
        return resp;
    }
    public static Answer isClickeable(){
        return new Answer();
    }
}
