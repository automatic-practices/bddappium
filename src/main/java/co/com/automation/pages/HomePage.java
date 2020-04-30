package co.com.automation.pages;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

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

  @FindBy(id = "mic.app.gastosdecompras:id/textBalanceInitial")
  private WebElementFacade txtBalanceInitial;

  @FindBy(id = "mic.app.gastosdecompras:id/textIncome")
  private WebElementFacade txtIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/textExpense")
  private WebElementFacade txtExpense;

  @FindBy(id = "mic.app.gastosdecompras:id/textBalanceFinal")
  private WebElementFacade txtBalanceFinal;

  public HomePage() {
    super();
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

  public void assertValues() {
    String balanceInitial = txtBalanceInitial.getTextValue();
    String balanceFinal = txtBalanceFinal.getTextValue();
    System.out.println("balanceIni " + balanceInitial + " balancefinal " + balanceFinal);
    assertEquals(balanceInitial, balanceFinal);
  }
}
