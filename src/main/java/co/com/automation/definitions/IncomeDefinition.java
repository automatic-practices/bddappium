package co.com.automation.definitions;

import co.com.automation.steps.AddIncomeStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class IncomeDefinition {
  @Steps AddIncomeStep addIncomeStep;

  @Dado("^que voy a la opción de agregar ingresos$")
  public void ir_opcion_agregar_ingresos() {
    addIncomeStep.goAddIncome();
  }

  @Cuando("^adiciono un ingreso con valor de  (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_ingresos(String value, String categoryOption, String description) {
    addIncomeStep.addIncome(value, categoryOption, description);
  }

  @Entonces("^en la opción de lista debería visualizar el ingreso agregado$")
  public void visualizar_ingresos() {}
}
