package edu.pedro.primeirasemana;

public class BoletimEstudantil {
  public static void main(String[] args) {  
    int mediaNota = 4;
    if (mediaNota < 5) {
      System.out.println("Reprovado");
    }
    else if (mediaNota < 7) {
      System.out.println("Recuperação");
    }
    else {
      System.out.println("Aprovado");
    }
  }
}