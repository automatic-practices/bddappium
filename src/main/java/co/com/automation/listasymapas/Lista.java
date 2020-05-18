package co.com.automation.listasymapas;

import java.util.*;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lista {

  private List<Integer> listaEnteros;
  private static final Logger LOGGER = LoggerFactory.getLogger(Lista.class);

  public void listEntero() {
    listaEnteros = new ArrayList<>();
    listaEnteros.add(4);
    listaEnteros.add(5);
    listaEnteros.add(1);
    listaEnteros.add(2);
    listaEnteros.add(0);
    listaEnteros.set(5, 8);
  }

  public void imprimirList1() {
    for (Integer index : listaEnteros) {
      LOGGER.info("Lista " + index);
    }
  }

  public void imprimirList2() {
    Iterator<Integer> list = listaEnteros.iterator();
    while (list.hasNext()) {
      LOGGER.info("Lista2 " + list.next());
    }
  }

  public void imprimirList1(List<Persona> listPersona) {
    for (Persona index : listPersona) {
      LOGGER.info("Nombre " + index.getNombre());
    }
  }

  public void listEntero2() {
    listaEnteros = new ArrayList<>();
    listaEnteros.add(4);
    listaEnteros.add(4);
    listaEnteros.add(1);
    listaEnteros.add(0);
    listaEnteros.add(0);
  }

  public void eliminarRepetidos() {
    listaEnteros = new ArrayList<>();
    listaEnteros.add(4);
    listaEnteros.add(4);
    listaEnteros.add(1);
    listaEnteros.add(0);
    listaEnteros.add(0);
    Set<Integer> remover = new HashSet<>(listaEnteros);
    for (Integer index : remover) {
      LOGGER.info("Lista " + index);
    }
  }

  public void imprimirListaForEach() {
    List<String> listaString = Arrays.asList("Lisandro", "Camilo", "Angela", "Carlos");
    listaString.forEach(System.out::println);
    System.out.println("\n");
    listaString.stream().filter(x -> x.startsWith("C")).forEach(LOGGER::info);
    System.out.println("\n");
    listaString
        .stream()
        .filter(x -> x.endsWith("o"))
        .map(String::toUpperCase)
        .forEach(LOGGER::info);
  }

  public List<Persona> returnListaPersonas() {

    List<Persona> listaPersona = new ArrayList<>();
    listaPersona.add(new Persona("Carlos", "Ariza", 65879));
    listaPersona.add(new Persona("Pepe", "Aguilar", 187456));
    listaPersona.add(new Persona("Alvaro", "Gomez", 325789));
    listaPersona.add(new Persona("Luis", "Alvarez", 478964));
    listaPersona.add(new Persona("Pedro", "Perez", 15879));
    listaPersona.add(new Persona("Maria", "Orozco", 16979));

    return listaPersona;
  }

  public void transformList(List<Persona> list) {
    list.stream()
        .filter(x -> x.getCedula().toString().startsWith("1"))
        .map(Persona::getNombre)
        .collect(Collectors.toList())
        .forEach(LOGGER::info);
  }

  // método que reciba una lista de personas, luego filtrar las cédulas que empiecen por 1 y que la
  // lista se transforme
  // en una lista String con los nombres de las personas de las cédulas filtradas, la lista debe
  // tener 6 elementos, 3 de
  // de ellos inician su cédula con 1.
}
