package co.com.automation.steps;

import co.com.automation.pages.ExpensePage;
import co.com.automation.pages.HomePage;
import co.com.automation.pages.IncomePage;
import co.com.automation.pages.ProjectsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class AddProjectStep extends ScenarioSteps {

  @Page HomePage homePage;
  @Page ProjectsPage addProjectPage;
  @Page IncomePage incomePage;
  @Page ExpensePage expensePage;

  @Step
  public void goAddProject() {
    homePage.goProjects();
  }

  @Step
  public void AddProject(String description, String value) {
    addProjectPage.selectNewProjectOption();
    addProjectPage.typeDescriptionProject(description);
    addProjectPage.typeProjectValue(value);
    addProjectPage.clickSaveProject();
    addProjectPage.clickReturnHome();
    homePage.goAddIncome();
  }

  @Step
  public void addIncome(String value, String categoryOption, String description) {
    incomePage.typeIncomeValue(value);
    incomePage.selectIncomeCategory();
    incomePage.selectIncomeCategoryOption(categoryOption);
    incomePage.typeDescriptionIncome(description);
    incomePage.clickSaveIncome();
    incomePage.clickReturnHome();
    homePage.goAddExpense();
  }

  @Step
  public void addExpense(String value, String categoryOption, String description) {
    expensePage.typeExpenseValue(value);
    expensePage.selectExpenseCategory();
    expensePage.selectExpenseCategoryOption(categoryOption);
    expensePage.typeDescriptionExpense(description);
    expensePage.clickSaveExpense();
    expensePage.clickReturnHome();
    //homePage.assertValues();
  }
}
