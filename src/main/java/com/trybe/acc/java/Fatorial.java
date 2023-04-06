package com.trybe.acc.java;

/**
 * Class Fatorial.
 */
public class Fatorial {

  /**
   * Initial Method.
   */
  public static void main(String[] args) {
    long fatorial18 = 1;
    for (int i = 18; i > 1; i--) {
      fatorial18 *= i;
    }

    System.out.println("O fatorial de 18 é igual a " + fatorial18);
  }

}
