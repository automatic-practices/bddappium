# language: es
Característica: Prueba de la funcionalidad de crear proyectos

  Esquema del escenario: agregar un proyecto con ingresos y gastos
    Dado que tengo un proyecto llamado <nombre_proyecto> y valor de <saldo_inicial>
    Cuando adiciono un ingreso con valor <valor_ingreso>, categoría <categoria_ingreso> y descripción Prueba
    Y adiciono un gasto con valor de <valor_gasto>, categoría <categoria_gasto> y descripción gasto1
    Entonces el saldo final deberá ser <saldo_final>

    Ejemplos:
      |nombre_proyecto|saldo_inicial|valor_ingreso|categoria_ingreso|valor_gasto|categoria_gasto|saldo_final|
      |Proyecto_Ángela|2000000      |100000       |Sueldo           |100000     |Comida         |2,000,000.00|
      |Proyecto_Camilo|2000000      |100000       |Sueldo           |100000     |Comida         |2,000,001.00|