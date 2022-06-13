
/*******************************************************************************
 * (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros,
 * além de determinar e imprimir o maior e o menor inteiro no grupo. 
 * Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 *******************************************************************************/
import java.util.Scanner;

public class Ex224 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int largest = 0;
    int smallest = 0;

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

    largest = number1;
    if (number2 > largest) {
      largest = number2;
    }
    if (number3 > largest) {
      largest = number3;
    }

    if (number4 > largest) {
      largest = number4;
    }

    if (number5 > largest) {
      largest = number5;
    }

    smallest = number1;
    if (number2 < smallest) {
      smallest = number2;
    }
    if (number3 < smallest) {
      smallest = number3;
    }
    if (number4 < smallest) {
      smallest = number4;
    }
    if (number5 < smallest) {
      smallest = number5;
    }

    System.out.printf("Números: %d, %d, %d, %d, %d%n", number1, number2, number3, number4, number5);
    System.out.printf("Maior número: %d%n", largest);
    System.out.printf("Menor número: %d%n", smallest);

    input.close();
  }
}
