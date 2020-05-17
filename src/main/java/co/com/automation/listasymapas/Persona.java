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
