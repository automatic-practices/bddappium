package co.com.automation.definitions;

import co.com.automation.steps.AddProjectStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ProjectDefinition {

  @Steps AddProjectStep addProjectStep;

  @Dado("^que tengo un proyecto llamado (.*) y valor de (.*)$")
  public void agregar_proyectos(String description, String value) {
    addProjectStep.goAddProject();
    addProjectStep.AddProject(description, value);
  }

  @Cuando("^adiciono un ingreso con valor (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_ingreso(String value, String categoryOption, String description) {
    addProjectStep.goIncome();
    addProjectStep.addIncome(value, categoryOption, description);
  }

  @Cuando("^adiciono un gasto con valor de (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_gastos(String value, String categoryOption, String description) {
    addProjectStep.goExpense();
    addProjectStep.addExpense(value, categoryOption, description);
  }

  @Entonces("^el saldo final deberá ser (.*)$")
  public void visualizar_saldo_final(String balanceFinal) {
    addProjectStep.showBalanceFinal(balanceFinal);
  }
}
