package com.mycompany.mavenproject1;
import java.util.Scanner;

public class ExercícioCondicionais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("ESCOLHA A ATIVIDADE 1-5");
        System.out.println("\nDigite o número da atividade: ");
        int atividade = ler.nextInt();
            switch (atividade) {
                case 1:
                    System.out.println("-------------------------------------------------");
                    System.out.println("PRIMEIRA ATIVIDADE");
                    System.out.println("MAIOR OU MENOR");
                    System.out.print("\nInforme um número: ");
                    float numero = ler.nextFloat();
                        if (numero > 0){
                            System.out.print("\n" + numero + " é maior que zero!\n");
                        }
                        else {
                            System.out.print("\n" + numero + " é menor que zero!\n");           
                        }
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println("SEGUNDA ATIVIDADE");
                        System.out.println("IMC");
                        System.out.print("\nInforme seu peso: ");
                        float peso = ler.nextFloat();
                        System.out.print("\nInforme sua altura EM METROS: ");
                        float altura = ler.nextFloat();
                        float IMC = peso/(altura * altura);
                            if (IMC > 25){
                                System.out.print("\nVocê está acima do peso!\n");
                            }
                            else {
                                System.out.print("\nVocê está saudavél!\n");           
                            }
                        System.out.println("-------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------");
                    System.out.println("TERCEIRA ATIVIDADE");
                    System.out.println("TIME VENCEDOR");
                    System.out.println("\nDigite o nome do primeiro time: ");
                    ler.nextLine();
                    String Time1 = ler.nextLine();
                    System.out.println("\nQuantos gols " + Time1 + " fez? ");
                    int Gols1 = ler.nextInt();
                    System.out.println("\nDigite o nome do segundo time: ");
                    ler.nextLine();
                    String Time2 = ler.nextLine();
                    System.out.println("\nQuantos gols " + Time2 + " fez? ");
                    int Gols2 = ler.nextInt();
                    if (Gols1 > Gols2) {
                        System.out.print(Time1 + " " + Gols1 + "X" + Gols2 + " " + Time2 + "\n");
                        System.out.print(Time1 + " foi o vencedor!\n");
                    }
                    else if (Gols1 < Gols2) {
                        System.out.print(Time1 + " " + Gols1 + "X" + Gols2 + " " + Time2 + "\n");
                        System.out.print(Time2 + " foi o vencedor!\n");
                    }
                    else {
                        System.out.print(Time1 + " " + Gols1 + "X" + Gols2 + " " + Time2 + "\n");
                        System.out.print("Ninguém ganhou!\n");
                    } 
                    System.out.println("-------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------------------");
                    System.out.println("QUARTA ATIVIDADE");
                    System.out.println("NÚMERO DO MÊS");
                    System.out.println("\nDigite um número: ");
                    int num1 = ler.nextInt();
                        switch (num1) {
                          case 1:
                            System.out.println("O número escolhido corresponde ao mês de Janeiro.");
                            break;
                          case 2:
                            System.out.println("O número escolhido corresponde ao mês de Fevereiro.");
                            break;
                          case 3:
                            System.out.println("O número escolhido corresponde ao mês de Março.");
                            break;
                          case 4:
                            System.out.println("O número escolhido corresponde ao mês de Abril.");
                            break;
                          case 5:
                            System.out.println("O número escolhido corresponde ao mês de Maio.");
                            break;
                          case 6:
                            System.out.println("O número escolhido corresponde ao mês de Junho.");
                            break;
                          case 7:
                            System.out.println("O número escolhido corresponde ao mês de Julho.");
                            break;
                          case 8:
                            System.out.println("O número escolhido corresponde ao mês de Agosto.");
                            break;
                          case 9:
                            System.out.println("O número escolhido corresponde ao mês de Setembro.");
                            break;
                          case 10:
                            System.out.println("O número escolhido corresponde ao mês de Outubro.");
                            break;
                          case 11:
                            System.out.println("O número escolhido corresponde ao mês de Novembro.");
                            break;
                          case 12:
                            System.out.println("O número escolhido corresponde ao mês de Dezembro.");
                            break;
                          default:
                            System.out.println("O número escolhido é inválido! Digite um número entre 1 a 12.");
                        }
                    System.out.println("-------------------------------------------------");
                    break;
                case 5:
                    System.out.println("QUINTA ATIVIDADE");
                    System.out.println("QUAL É MENOR");
                    System.out.println("\nDigite o primeiro número: ");
                    int n1 = ler.nextInt();
                    System.out.println("\nDigite o segundo número: ");
                    int n2 = ler.nextInt();
                    System.out.println("\nDigite o terceiro número: ");
                    int n3 = ler.nextInt();
                    System.out.println("\nDigite o quarto número: ");
                    int n4 = ler.nextInt();        
                        if (n1 > n2 && n1 > n3 && n1 > n4) {
                            System.out.println("\n" + n1 + " é o maior número!\n");
                        }
                        else if (n2 > n1 && n2 > n3 && n2 > n4){
                            System.out.println("\n" + n2 + " é o maior número!\n");
                        }
                        else if (n3 > n1 && n3 > n2 && n3 > n4){
                            System.out.println("\n" + n3 + " é o maior número!\n");
                        }
                        else {
                            System.out.println("\n" + n4 + " é o maior número!\n");
                        }
                        System.out.println("-------------------------------------------------"); 
                    break;
                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 5.");
            }
    }
}
