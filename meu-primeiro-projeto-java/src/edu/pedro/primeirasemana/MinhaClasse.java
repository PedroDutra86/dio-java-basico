package edu.pedro.primeirasemana;

public class MinhaClasse {
  public static void main (String [] args) {
    String firstName = "Pedro";
    String secondName = "Dutra";
    
    String fullName = fullName(firstName, secondName);
    System.out.println(fullName);
  }
  public static String fullName (String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
  }
}