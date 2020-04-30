package co.com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProjectsPage extends PageObjectMobile {

  @FindBy(id = "mic.app.gastosdecompras:id/textNewProject")
  private WebElementFacade BtnNewProject;

  @FindBy(id = "mic.app.gastosdecompras:id/editProjectName")
  private WebElementFacade lblProjectName;

  @FindBy(id = "mic.app.gastosdecompras:id/editInitialBalance")
  private WebElementFacade lblInitialBalance;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonOk")
  private WebElementFacade btnSaveProject;

  @FindBy(id = "mic.app.gastosdecompras:id/imageApp")
  private WebElementFacade btnReturnHome;

  public ProjectsPage() {
    super();
  }

  public void selectNewProjectOption() {
    BtnNewProject.click();
  }

  public void typeDescriptionProject(String description) {
    lblProjectName.sendKeys(description);
  }

  public void typeProjectValue(String value) {
    lblInitialBalance.sendKeys(value);
  }

  public void clickSaveProject() {
    btnSaveProject.click();
  }

  public void clickReturnHome() {
    btnReturnHome.click();
  }
}
