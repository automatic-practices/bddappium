package co.com.automation.listasymapas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lista {

  private List<Integer> listaEnteros;

  public void listEntero() {
    listaEnteros = new ArrayList<>();
    listaEnteros.add(4);
    listaEnteros.add(5);
    listaEnteros.add(1);
    listaEnteros.add(2);
    listaEnteros.add(0);
  }

  public void imprimirList1() {
    for (Integer index : listaEnteros) {
      System.out.println("Lista " + index);
    }
  }

  public void imprimirList2() {
    Iterator<Integer> list = listaEnteros.iterator();
    while (list.hasNext()) {
      System.out.println("Lista2 " + list.next());
    }
  }

  public void imprimirList1(List<Persona> listPersona) {
    for (Persona index : listPersona) {
      System.out.println("Nombre " + index.getNombre());
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
      System.out.println("Lista " + index);
    }
  }
}
