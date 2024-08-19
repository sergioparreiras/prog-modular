/*
 08 - Sabendo que 1º de janeiro de 2024 foi uma segunda feira, escreva um método que receba uma data e diga
 em qual dia da semana esta data acontecerá em 2024. Escreva um programa principal para testar seu método.
*/

import java.util.Scanner;

public class DiaDaSemana {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o dia: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o mes: ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.println();
        String diaDaSemana = calcularDiaDaSemana(dia, mes);
        System.out.println("O dia " + dia + "/" + mes + "/2024 será uma " + diaDaSemana);
        
        sc.close();
    }

    public static String calcularDiaDaSemana(int dia, int mes) {
        
        //Coloquei o ano como bissexto pq 2024 foi ano bissexto
        int[] diasPorMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        int diasTotais = dia - 1; 
        for (int i = 1; i < mes; i++) {
            diasTotais += diasPorMes[i];
        }
        
        int diaDaSemana = (diasTotais % 7);
        
        String[] diasDaSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        return diasDaSemana[diaDaSemana];
    }
    
}