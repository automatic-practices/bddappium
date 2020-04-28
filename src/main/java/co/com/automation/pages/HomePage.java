package co.com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObjectMobile {
  @FindBy(id = "mic.app.gastosdecompras:id/buttonAddIncome")
  private WebElementFacade btnAddIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonList")
  private WebElementFacade btnIncomeOutcomeList;

  public HomePage() {
    super();
  }

  public void goAddIncome() {
    btnAddIncome.click();
  }

  public void goIncomeOutcomeList() {
    btnIncomeOutcomeList.click();
  }
}

// Ctrl + Alt + O remueve los imports que no se usan
// Ctrl + Alt + L = Alineación del texto
// Constructor Alt + insert
// Alt +Enter : Importar librerias
// Ctrl +D duplica código seleccionado
