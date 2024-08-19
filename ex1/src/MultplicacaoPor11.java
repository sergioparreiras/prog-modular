/*
 06 - Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos funciona assim: para multiplicar 81
 x 11, some os dígitos do número (8 + 1 = 9) e insira o resultado entre os dígitos (891). Se a soma der maior que 9,
 incremente o dígito da esquerda (vai-um): 56 x 11 = 616. Escreva um programa que efetue multiplicações por 11
 usando este algoritmo
 */

import java.util.Scanner;

public class MultplicacaoPor11 {

    public static int multiplicarPor11(int num) {
    
        int num1  = num / 10;  // Primeiro dígito
        int num2 = num % 10;   // Segundo dígito
        int soma = num1 + num2;
    
        if (soma > 9) {
            num1 += 1;
            soma -= 10;
        }
    
        // Constrói o número final como inteiro
        return num1 * 100 + soma * 10 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de dois digitos: ");
        int valor = Integer.parseInt(sc.nextLine());

        int result  = multiplicarPor11(valor);

        System.out.println("Resultado: " + result);

        sc.close();
    }
}
