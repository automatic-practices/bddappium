package co.com.automation.definitions;

import co.com.automation.steps.AddProjectStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class ProjectDefinition {

  @Steps AddProjectStep addProjectStep;

  @Dado("^que agrego un proyecto llamado (.*) y valor de (.*)$")
  public void agregar_proyectos(String description, String value) {
    addProjectStep.goAddProject();
    addProjectStep.AddProject(description, value);
  }

  @Cuando("^adiciono un ingreso con valor (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_ingreso(String value, String categoryOption, String description) {
    addProjectStep.addIncome(value, categoryOption, description);
  }

  @Y("^adiciono un gasto con valor de (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_gastos(String value, String categoryOption, String description) {
    addProjectStep.addExpense(value, categoryOption, description);
  }

  @Entonces("^en el home page se debe visualizar el proyecto$")
  public void visualizar_proyecto() {}
}
