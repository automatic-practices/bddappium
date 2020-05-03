package co.com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class HomePage extends PageObjectMobile {

  @FindBy(id = "mic.app.gastosdecompras:id/buttonAddIncome")
  private WebElementFacade btnAddIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonAddExpense")
  private WebElementFacade btnAddExpense;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonList")
  private WebElementFacade btnIncomeOutcomeList;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonReports")
  private WebElementFacade btnReports;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonProjects")
  private WebElementFacade btnProjects;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonSettings")
  private WebElementFacade btnSettings;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonProject")
  private WebElementFacade cmbProject;

  @FindBy(id = "mic.app.gastosdecompras:id/textBalanceInitial")
  private WebElementFacade lblBalanceInitial;

  @FindBy(id = "mic.app.gastosdecompras:id/textIncome")
  private WebElementFacade lblIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/textExpense")
  private WebElementFacade lblExpense;

  @FindBy(id = "mic.app.gastosdecompras:id/textBalanceFinal")
  private WebElementFacade lblBalanceFinal;

  public HomePage() {
    super();
  }

  public void selectProject() {
    cmbProject.click();
  }

  public void selectProjectOption(String projectOption) {
    getDriver()
        .findElement(By.xpath("//android.widget.TextView[@text='" + projectOption + "']"))
        .click();
  }

  public void goAddIncome() {
    btnAddIncome.click();
  }

  public void goAddExpense() {
    btnAddExpense.click();
  }

  public void goIncomeOutcomeList() {
    btnIncomeOutcomeList.click();
  }

  public void goReports() {
    btnReports.click();
  }

  public void goProjects() {
    btnProjects.click();
  }

  public void goSettings() {
    btnSettings.click();
  }

  public String getBalanceFinal() {
    return lblBalanceFinal.getText();
  }
}
