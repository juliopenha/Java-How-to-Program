/*******************************************************************************
 * (O valor inteiro de um caractere) Eis outra prévia do que virá adiante.
 * Neste capítulo, você aprendeu sobre inteiros e o tipo int.
 * O Java também pode representar letras maiúsculas, minúsculas e uma variedade
 * considerável de símbolos especiais. Cada caractere tem uma representação
 * correspondente de inteiro. O conjunto de caracteres que um computador utiliza
 * com as respectivas representações na forma de inteiro desses caracteres é
 * chamado de conjunto de caracteres desse computador. Você pode indicar um
 * valor
 * de caractere em um programa simplesmente incluindo esse caractere entre aspas
 * simples, como em ‘A'.
 * Você pode determinar o equivalente em inteiro de um caractere precedendo-o
 * com
 * (int), como em (int) 'A'.
 * Um operador dessa forma é chamado operador de coerção. (Você aprenderá sobre
 * os
 * operadores de coerção no Capítulo 4.) A instrução a seguir gera saída de um
 * caractere e seu equivalente de inteiro:
 * System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
 * Quando a instrução precedente executa, ela exibe o caractere A e o valor 65
 * (do conjunto de caracteres Unicode®) como parte da string. O especificador de
 * formato %c é um espaço reservado para um caractere (nesse caso, ‘A').
 * Utilizando instruções semelhantes àquela mostrada anteriormente neste
 * exercício,
 * escreva um aplicativo que exiba os equivalentes inteiros de algumas letras
 * maiúsculas, minúsculas, dígitos e símbolos especiais.
 * Mostre os equivalentes inteiros do seguinte:
 * A B C a b c 0 1 2 $ * + / e o caractere em branco.
 *******************************************************************************/
public class Ex229 {
  public static void main(String[] args) {
    System.out.println("Equivalentes inteiros dos caracteres:");
    System.out.printf("A: %d%n", (int) 'A');
    System.out.printf("B: %d%n", (int) 'B');
    System.out.printf("C: %d%n", (int) 'C');
    System.out.printf("a: %d%n", (int) 'a');
    System.out.printf("b: %d%n", (int) 'b');
    System.out.printf("c: %d%n", (int) 'c');
    System.out.printf("0: %d%n", (int) '0');
    System.out.printf("1: %d%n", (int) '1');
    System.out.printf("2: %d%n", (int) '2');
    System.out.printf("$: %d%n", (int) '$');
    System.out.printf("*: %d%n", (int) '*');
    System.out.printf("+: %d%n", (int) '+');
    System.out.printf("/: %d%n", (int) '/');
    System.out.printf(" : %d%n", (int) ' ');
  }
}
