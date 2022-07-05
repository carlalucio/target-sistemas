package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
 * anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
 * informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número
 * informado pertence ou não a sequência.
 */
public class Exercicio2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2= 0;
        List <Integer> seqFibonacci = new ArrayList<>();

        seqFibonacci.add(0);
        seqFibonacci.add(1);

        System.out.println("Insira um número:");
        int numero = scan.nextInt();

        while (num1 <= numero){
            num1 = num1 + num2;
            num2 = num1 - num2;
            seqFibonacci.add(num1);

        }

        if(seqFibonacci.contains(numero)){
            System.out.println("A sequência Fibonacci contém o número " + numero );
        }else {
            System.out.println("A sequência Fibonacci até o " + seqFibonacci.size() +  "º termo, Não contém o número " + numero);
        }

        System.out.println(seqFibonacci);





    }


}
