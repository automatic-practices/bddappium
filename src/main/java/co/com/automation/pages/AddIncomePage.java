package co.com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class AddIncomePage extends PageObjectMobile {
  @FindBy(id = "mic.app.gastosdecompras:id/editAmount")
  private WebElementFacade txtValueIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/spinnerCategory")
  private WebElementFacade cmbCategory;

  @FindBy(id = "mic.app.gastosdecompras:id/editDescription")
  private WebElementFacade lblDescription;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonSave")
  private WebElementFacade btnSave;

  public AddIncomePage() {
    super();
  }

  public void typeIncomeValue(String value) {
    txtValueIncome.sendKeys(value);
  }

  public void selectIncomeCategory() {
    cmbCategory.click();
  }

  public void selectIncomeCategoryOption(String categoryOption) {
    getDriver()
        .findElement(By.xpath("//android.widget.TextView[@text='" + categoryOption + "']"))
        .click();
  }

  public void typeDescriptionIncome(String description) {
    this.lblDescription.sendKeys(description);
  }

  public void clickSaveIncome() {
    btnSave.click();
  }
}
