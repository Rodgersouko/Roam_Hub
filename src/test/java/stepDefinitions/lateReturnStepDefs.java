package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BatteryRental;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class lateReturnStepDefs extends BatteryRental{
    BatteryRental batteryRental = new BatteryRental();
    List<String[]> inputTimes = new ArrayList();
    int expectedLateReturn;
    int actualLateReturn;

    //Test pre-condition that need to be in place before the main action takes place
    @Given("user has rider's inputs returnTime  and borrowTime")
    public void user_has_rider_s_inputs_return_time_and_borrow_time() {

        BatteryRental.countLateReturns(inputTimes);

    }

    //Test action, it represents the action being tested or the event that triggers the behavior being observed.
    @When("the user takes more than 5hours with the battery")
    public void the_user_takes_more_than_5hours_with_the_battery() {
        //Selenium action test script goes here(where environment is available)
        expectedLateReturn = 2;

        actualLateReturn = 5; // set to 2 for a complete pass
        System.out.println("late return count is "+ expectedLateReturn);
    }

    //Test verification from above action,
    // it represents the verification or assertion step where you check if the system behaves as expected.
    @Then("count late returns to be two")
    public void count_late_returns_to_be() {

        //Assertion set to fail to give a report of how failure looks like
        Assert.assertEquals(expectedLateReturn,actualLateReturn);
    }
}
