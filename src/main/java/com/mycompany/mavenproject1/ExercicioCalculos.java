package com.mycompany.mavenproject1;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("PRIMEIRA ATIVIDADE");
        System.out.println("CALCULADORA");
        System.out.print("\nInforme um número: ");
        float numero = ler.nextFloat();
        float metade = numero/2;
        System.out.println("A metade deste número é igual a: " + metade);
        System.out.println("-------------------------------------------------");
        System.out.println("SEGUNDA ATIVIDADE");
        System.out.println("IDADE");
        System.out.println("\nDigite seu ano de nascimento: ");
        int ano = ler.nextInt();
        int idade = 2023 - ano;
        System.out.println("Você tem " + idade + " anos");
        System.out.println("-------------------------------------------------");
        System.out.println("TERCEIRA ATIVIDADE");
        System.out.println("ÁREA DO RETÂNGULO");
        System.out.println("\nDigite o primeiro valor: ");
        float lado1 = ler.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float lado2 = ler.nextFloat();
        float areaRetangulo = lado1 * lado2;
        System.out.println("O valor da área de seu retângulo é igual a: " + areaRetangulo);
        System.out.println("-------------------------------------------------");
        System.out.println("QUARTA ATIVIDADE");
        System.out.println("PERÍMETRO DO RETÂNGULO");
        System.out.println("\nDigite o primeiro valor: ");
        float plado1 = ler.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float plado2 = ler.nextFloat();
        float perimetroRetangulo = 2 * plado1 + 2 * plado2;
        System.out.println("O valor da área de seu retângulo é igual a: " + perimetroRetangulo);
        System.out.println("-------------------------------------------------");
        System.out.println("QUINTA ATIVIDADE");
        System.out.println("DESCONTO");
        System.out.println("\nDigite o valor do produto: ");
        double valorProduto = ler.nextFloat();
        double desconto = valorProduto - (valorProduto * 0.4);
        System.out.println("O valor do produto com desconto é igual a: " + desconto);
        System.out.println("-------------------------------------------------");
    }
}
