
/*******************************************************************************
 * (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros
 * digitados pelo usuário e exiba a soma, média, produto e os números menores e
 * maiores. Utilize as técnicas mostradas na Figura 2.15.
 * [Observação: o cálculo da média neste exercício deve resultar em uma
 * representação de inteiro. Assim, se a soma dos valores for 7, a média deverá
 * ser 2, não 2,3333...]
 *******************************************************************************/
import java.util.Scanner;

public class Ex217 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int sum = 0;
    int avg = 0;
    int product = 0;
    int largest = 0;
    int smallest = 0;

    System.out.println("Insira o primeiro número inteiro: ");
    number1 = input.nextInt();

    System.out.println("Insira o segundo número inteiro: ");
    number2 = input.nextInt();

    System.out.println("Insira o terceiro número inteiro: ");
    number3 = input.nextInt();

    sum = number1 + number2 + number3;
    product = number1 * number2 * number3;
    avg = sum / 3;

    largest = number1;
    if (number2 > largest) {
      largest = number2;
    }
    if (number3 > largest) {
      largest = number3;
    }

    smallest = number1;
    if (number2 < smallest) {
      smallest = number2;
    }
    if (number3 < smallest) {
      smallest = number3;
    }

    System.out.printf("Números: %d, %d, %d%n", number1, number2, number3);
    System.out.printf("Soma: %d%n", sum);
    System.out.printf("Produto: %d%n", product);
    System.out.printf("Média: %d%n", avg);
    System.out.printf("Maior número: %d%n", largest);
    System.out.printf("Menor número: %d%n", smallest);

    input.close();
  }
}
