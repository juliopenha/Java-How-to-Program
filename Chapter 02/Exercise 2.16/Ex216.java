
/*******************************************************************************
 * (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir
 * dois inteiros, obtenha dele esses números e exiba o número maior seguido
 * pelas
 * palavras “is larger". Se os números forem iguais, imprima a mensagem
 * “These numbers are equal".
 * Utilize as técnicas mostradas na Figura 2.15.
 *******************************************************************************/
import java.util.Scanner;

public class Ex216 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1 = 0;
    int number2 = 0;

    System.out.println("Insira o primeiro número inteiro: ");
    number1 = input.nextInt();

    System.out.println("Insira o segundo número inteiro: ");
    number2 = input.nextInt();

    if (number1 > number2) {
      System.out.printf("%d is larger%n", number1);
    } else if (number1 < number2) {
      System.out.printf("%d is larger%n", number2);
    } else {
      System.out.println("These numbers are equal");
    }

    input.close();
  }
}
