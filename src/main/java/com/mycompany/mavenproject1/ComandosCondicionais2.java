package com.mycompany.mavenproject1;
import java.util.Scanner;

public class ComandosCondicionais2 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("-------------------------------------------------");
            System.out.println("PRIMEIRA ATIVIDADE");
            System.out.println("MAIOR OU MENOR");
            System.out.print("\nInforme o primeiro número: ");
            float numero1 = ler.nextFloat();
            System.out.print("\nInforme o segundo número: ");
            float numero2 = ler.nextFloat();
            if (numero1 > numero2){
                System.out.print("\n" + numero1 + " é maior que " + numero2 + "!\n");
            }
            else {
                System.out.print("\n" + numero2 + " é maior que " + numero1 + "!\n");           
            }
            System.out.println("-------------------------------------------------");
        }
}
