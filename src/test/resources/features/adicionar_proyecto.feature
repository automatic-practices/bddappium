# language: es
Característica: Prueba de la funcionalidad de crear proyectos
      Escenario: agregar un proyecto con ingresos y gastos
      Dado que agrego un proyecto llamado Proyecto_Ángela y valor de 2000000
      Cuando adiciono un ingreso con valor 100000, categoría Sueldo y descripción Prueba
      Y adiciono un gasto con valor de 100000, categoría Comida y descripción gasto1
      Entonces en el home page se debe visualizar el proyecto