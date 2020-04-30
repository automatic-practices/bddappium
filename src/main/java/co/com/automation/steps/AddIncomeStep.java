package co.com.automation.steps;

import co.com.automation.pages.HomePage;
import co.com.automation.pages.IncomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class AddIncomeStep extends ScenarioSteps {

  @Page HomePage homePage;
  @Page IncomePage addIncomePage;

  @Step
  public void goAddIncome() {
    homePage.goAddIncome();
  }

  @Step
  public void addIncome(String value, String categoryOption, String description) {
    addIncomePage.typeIncomeValue(value);
    addIncomePage.selectIncomeCategory();
    addIncomePage.selectIncomeCategoryOption(categoryOption);
    addIncomePage.typeDescriptionIncome(description);
    addIncomePage.clickSaveIncome();
    addIncomePage.clickReturnHome();
  }
}
