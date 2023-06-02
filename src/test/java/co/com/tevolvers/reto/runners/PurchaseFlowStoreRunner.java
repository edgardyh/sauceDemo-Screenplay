package co.com.tevolvers.reto.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/features/purchase_flow_store.feature",
        glue = "co/com/tevolvers/reto/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "")

public class PurchaseFlowStoreRunner {
}
