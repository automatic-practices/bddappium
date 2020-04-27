package co.com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddIncomePage extends PageObjectMobile {
  @FindBy(id = "mic.app.gastosdecompras:id/editAmount")
  private WebElementFacade valueIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/spinnerCategory")
  private WebElementFacade category;

  @FindBy(id = "mic.app.gastosdecompras:id/editDescription")
  private WebElementFacade description;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonSave")
  private WebElementFacade save;

  public AddIncomePage() {
    super();
  }

  public void typeIncomeValue(String value) {
    valueIncome.sendKeys(value);
  }

  public void selectIncomeCategory(String category) {
    this.category.sendKeys(category);
  }

  public void typeDescriptionIncome(String description) {
    this.description.sendKeys(description);
  }

  public void clickSaveIncome() {
    save.click();
  }
}
