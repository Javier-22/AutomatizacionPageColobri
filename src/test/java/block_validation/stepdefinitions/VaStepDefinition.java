package block_validation.stepdefinitions;

import block_validation.model.FormData;
import block_validation.model.LoginData;
import block_validation.questions.Answer;
import block_validation.tasks.Form;
import block_validation.tasks.Login;
import block_validation.tasks.OpenUp;
import block_validation.tasks.SeleForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VaStepDefinition {
    @Before
    public void sedStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user  must be able  to register$")
    public void theUserMustBeAbleToRegister() {
        {
            OnStage.theActorCalled("user").wasAbleTo(OpenUp.theUrl());
        }
    }
    @When("^user logs$")
    public void userLogs(List<LoginData>loginData) {
        theActorInTheSpotlight().attemptsTo(Login.ldo(loginData));
    }

    @And("^Enter block validation functionality$")
    public void enterBlockValidationFunctionality() {
        theActorInTheSpotlight().attemptsTo(SeleForm.fv());
    }

    @And("^fill out block validation form$")
    public void fillOutBlockValidationForm(List<FormData>formData) {
        theActorInTheSpotlight().attemptsTo(Form.df(formData));

    }

    @Then("^user must be able to click the validate button$")
    public void userMustBeAbleToClickTheValidateButton() {
        theActorInTheSpotlight().should(seeThat(Answer.isClickeable()));
    }
}


