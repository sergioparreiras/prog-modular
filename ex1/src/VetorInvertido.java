/*
*   01 - Preencha um vetor de 6 números inteiros a partir da entrada do usuário e, depois, inverter as posições dos
*   números do vetor. Por exemplo, se o vetor original era 4-8-15-16-23-42, ao final da execução deve ser
*   apresentado o resultado 42-23-16-15-8-4.
*/

import java.util.Scanner;


public class VetorInvertido {

    public static int[] inverterVetor(int[] vetor) {
        int[] vetorInvertido = new int[vetor.length];
        
        for (int i = 0; i < vetor.length; i++) {
            vetorInvertido[i] = vetor[(vetor.length - i) - 1];
        }
        
        return vetorInvertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor a ser lido? ");
        int tamanhoDoVetor = Integer.parseInt(sc.nextLine());
        int[] vetor = new int[tamanhoDoVetor];
        
        System.out.println();
        for (int i = 0; i < tamanhoDoVetor; i++) {
            System.out.print("Digite os valores a serem armazenados no vetor: " );
            vetor[i] = Integer.parseInt(sc.nextLine());
        }

        int[] vetorInvertido = inverterVetor(vetor);

        System.out.println("\nVetor invertido:");
        for (int i = 0; i < vetorInvertido.length; i++) {
            System.out.print(vetorInvertido[i] + " ");
        }
        
        sc.close();
    }
}

