package desafios;

import java.util.Scanner;

/**
 * 5) Escreva um programa que inverta os caracteres de um string.
 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente
 * definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse;
 */

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String original = scan.next();

        String reverse = "";
            for (int i = original.length() - 1;  0 <= i; i--) {
                reverse += original.charAt(i);
            }
        System.out.println(reverse);
        }
    }

