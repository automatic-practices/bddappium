package co.com.automation.steps;

import co.com.automation.pages.AddIncomePage;
import co.com.automation.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class AddIncomeStep extends ScenarioSteps {

  @Page HomePage homePage;
  @Page AddIncomePage addIncomePage;

  @Step
  public void goAddIncome() {
    homePage.goAddIncome();
  }

  @Step
  public void addIncome(String value, String category, String description) {
    addIncomePage.typeIncomeValue(value);
    addIncomePage.selectIncomeCategory(category);
    addIncomePage.typeDescriptionIncome(description);
    addIncomePage.clickSaveIncome();
  }
}
