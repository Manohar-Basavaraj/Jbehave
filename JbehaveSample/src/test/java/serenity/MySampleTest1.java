package serenity;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class MySampleTest1 {
    @Given("my foo method ...")
    public void foo() {
        System.out.println("[Given] my foo method ...");
    }

    @Then("my bar method ...")
    public void bar() {
        System.out.println("[Then] my bar method ...");
    }
}
