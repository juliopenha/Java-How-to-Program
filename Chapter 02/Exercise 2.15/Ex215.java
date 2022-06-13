
/*******************************************************************************
 * (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois
 * inteiros, obtenha dele esses números e imprima sua soma, produto, diferença
 * e quociente (divisão).
 * Utilize as técnicas mostradas na Figura 2.7.
 *******************************************************************************/

import java.util.Scanner;

public class Ex215 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1 = 0;
    int number2 = 0;
    int sum = 0;
    int product = 0;
    int difference = 0;
    int division = 0;

    System.out.println("Insira o primeiro número inteiro: ");
    number1 = input.nextInt();

    System.out.println("Insira o segundo número inteiro: ");
    number2 = input.nextInt();

    sum = number1 + number2;
    product = number1 * number2;
    difference = number1 - number2;
    division = number1 / number2;

    System.out.printf("Soma = %d%n", sum);
    System.out.printf("Produto = %d%n", product);
    System.out.printf("Diferença = %d%n", difference);
    System.out.printf("Divisão = %d%n", division);

    input.close();
  }
}
