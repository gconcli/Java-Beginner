package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bom dia!");
        System.out.print("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = ler.nextInt();
        System.out.print("Informe seu salário: ");
        float salario = ler.nextFloat();
        System.out.println("\n****************");
        System.out.println("Ficha cadastral:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sálario: " + salario);
        System.out.println("****************");
        
        System.out.print("Diga o percentual de aumento do seu salário: ");
        float percentual = ler.nextFloat();
        float novoSalario = (salario * percentual)/100 + salario;
        System.out.println("Seu novo salário é igual a: " + novoSalario);
    }
}
