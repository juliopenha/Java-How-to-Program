/*******************************************************************************
 * (Valores negativos, positivos e zero) Escreva um programa que insira cinco 
 * números, além de determinar e imprimir quantos negativos, quantos positivos 
 * e quantos zeros foram inseridos.
 *******************************************************************************/

import java.util.Scanner;

public class Ex232 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int negatives = 0;
    int positives = 0;
    int zeros = 0;

    System.out.println("Insira o primeiro número inteiro: ");
    number1 = input.nextInt();

    System.out.println("Insira o segundo número inteiro: ");
    number2 = input.nextInt();

    System.out.println("Insira o terceiro número inteiro: ");
    number3 = input.nextInt();

    System.out.println("Insira o quarto número inteiro: ");
    number4 = input.nextInt();

    System.out.println("Insira o quinto número inteiro: ");
    number5 = input.nextInt();

    input.close();

    if(number1 > 0) {
      positives++;
    } else if(number1 == 0) {
      zeros++;
    } else {
      negatives++;
    }
    if(number2 > 0) {
      positives++;
    } else if(number2 == 0) {
      zeros++;
    } else {
      negatives++;
    }
    if(number3 > 0) {
      positives++;
    } else if(number3 == 0) {
      zeros++;
    } else {
      negatives++;
    }
    if(number4 > 0) {
      positives++;
    } else if(number4 == 0) {
      zeros++;
    } else {
      negatives++;
    }
    if(number5 > 0) {
      positives++;
    } else if(number5 == 0) {
      zeros++;
    } else {
      negatives++;
    }
    System.out.printf("Positivos: %d.\n", positives);
    System.out.printf("Negativos: %d.\n", negatives);
    System.out.printf("Zeros: %d.\n", zeros);
  }
}
