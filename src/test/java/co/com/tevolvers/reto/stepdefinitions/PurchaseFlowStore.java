package co.com.tevolvers.reto.stepdefinitions;

import co.com.tevolvers.reto.exception.ExceptionError;
import co.com.tevolvers.reto.model.builder.GeneralBuilder;
import co.com.tevolvers.reto.question.CountTotalItems;
import co.com.tevolvers.reto.question.TotalItemTax;
import co.com.tevolvers.reto.task.*;
import co.com.tevolvers.reto.userinterface.FormInformation;
import co.com.tevolvers.reto.userinterface.OverviewCheckout;
import co.com.tevolvers.reto.util.constants.MessagesFinal;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseFlowStore {

    @Managed(driver = "chrome")
    static WebDriver driver;

    @Before
    public void configuration() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Client");
    }

    @Given("user log in to the store page")
    public void user_log_in_to_the_store_page() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
        theActorInTheSpotlight().attemptsTo(CredentialsLogIn.LogInToThePage());
    }

    @When("sort the products from lowest to highest value, Add to cart the product with the lowest to the " +
            "highest price, and another product with any price")
    public void sort_the_products_from_lowest_to_highest_value() {
        theActorInTheSpotlight().attemptsTo(AddToCar.Product());
    }

    @When("Go to the car and remove one of the products")
    public void go_to_the_cart_and_remove_one_of_the_products() {
        theActorInTheSpotlight().attemptsTo(RemoveAndCheck.productOfTheCar());
    }

    @When("do the checkout, enter all the data, continue and validate that the totalItems is correct")
    public void do_the_checkout_enter_all_the_data_and_continue() {
        theActorInTheSpotlight().attemptsTo(FillOutForm.withInformationRequired());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CountTotalItems.validateCountITems(),
                Matchers.equalTo(true)).orComplainWith(ExceptionError.class, MessagesFinal.MESSAGE_PERSONALIZED_ERROR));
    }

    @When("validate that the total sum of totalItems + tax is correct.")
    public void validate_that_the_total_sum_of_totalItems_tax_is_correct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TotalItemTax.validateSumTotal(),
                Matchers.equalTo(true)).orComplainWith(ExceptionError.class,MessagesFinal.MESSAGE_TAX_TOTAL_ITEM));
    }

    @Then("validate final message when buying")
    public void validate_the_total_price_flight_limitation_to_continue_by_captcha() {
        theActorInTheSpotlight().attemptsTo(PurchaseMade.doActionInBotton());
        OnStage.withCurrentActor(Ensure.that
                (OverviewCheckout.TXT_MSJ_PURCHASE).text().contains(GeneralBuilder.with().aDataGeneral().getPurchaseMAde()));
    }

    @Given("user log in to the store page sauce")
    public void user_log_in_to_the_store_page_sauce() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("try to access with lock credentials")
    public void try_to_access_with_lock_credentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProblemUserCheckout.validatingFieldAndCheck());
    }

    @Then("user should an error message in checkout")
    public void user_should_an_error_message() {
        OnStage.withCurrentActor(Ensure.that(FormInformation.INP_ERROR_MSG_LAST_NAME).text().contains(MessagesFinal.MESSAGE_ERROR_LAST_NAME));
    }

    @When("no selected article and continue to the final flow")
    public void no_selected_article_and_continue_to_the_final_flow() {
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseWithoutArticle.emptyPurchase());
    }

    @Then("no should see positive message like a succesful purchase")
    public void no_should_see_positive_message_like_a_succesful_purchase() {
        OnStage.withCurrentActor(Ensure.that
                (OverviewCheckout.TXT_MSJ_PURCHASE).text().contains(GeneralBuilder.with().aDataGeneral().getPurchaseMAde()));
    }

}
