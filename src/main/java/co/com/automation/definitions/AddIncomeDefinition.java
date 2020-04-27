package co.com.automation.definitions;

import co.com.automation.steps.AddIncomeStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class AddIncomeDefinition {
  @Steps AddIncomeStep addIncomeStep;

  @Dado("^que voy a la opción de agregar ingresos$")
  public void ir_opcion_agregar_ingresos() {
    addIncomeStep.goAddIncome();
  }

  @Cuando("^adiciono un ingreso con valor (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_ingresos(String value, String category, String description) {
    addIncomeStep.addIncome(value, category, description);
  }

  /* @Entonces("^en la opción de lista debería visualizar el ingreso agregado$")
  public void visualizar_ingresos () {
  }*/

}
