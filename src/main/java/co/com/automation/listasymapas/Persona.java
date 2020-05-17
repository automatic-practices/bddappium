package co.com.automation.listasymapas;

public class Persona {

  private String nombre;
  private String apellido;
  private int cedula;

  public Persona(String nombre, String apellido, int cedula) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
  }

  public Persona() {}

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getCedula() {
    return cedula;
  }
}
//método que reciba una lista de personas, luego filtrar las cédulas que empiecen por 1 y que la lista se transforme
//en una lista String con los nombres de las personas de las cédulas filtradas, la lista debe tener 6 elementos, 3 de
// de ellos inician su cédula con 1.