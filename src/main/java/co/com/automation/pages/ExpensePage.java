package co.com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ExpensePage extends PageObjectMobile {

  @FindBy(id = "mic.app.gastosdecompras:id/editAmount")
  private WebElementFacade txtValueExpense;

  @FindBy(id = "mic.app.gastosdecompras:id/spinnerCategory")
  private WebElementFacade cmbCategory;

  @FindBy(id = "mic.app.gastosdecompras:id/editDescription")
  private WebElementFacade lblDescription;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonSave")
  private WebElementFacade btnSave;

  @FindBy(id = "mic.app.gastosdecompras:id/imageApp")
  private WebElementFacade btnReturnHome;

  public ExpensePage() {
    super();
  }

  public void typeExpenseValue(String value) {
    txtValueExpense.sendKeys(value);
  }

  public void selectExpenseCategory() {
    cmbCategory.click();
  }

  public void selectExpenseCategoryOption(String categoryOption) {
    getDriver()
        .findElement(By.xpath("//android.widget.TextView[@text='" + categoryOption + "']"))
        .click();
  }

  public void typeDescriptionExpense(String description) {
    this.lblDescription.sendKeys(description);
  }

  public void clickSaveExpense() {
    btnSave.click();
  }

  public void clickReturnHome() {
    btnReturnHome.click();
  }
}
