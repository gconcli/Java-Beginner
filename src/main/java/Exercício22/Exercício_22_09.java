package Exercício22;
import java.util.Scanner;

public class Exercício_22_09 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("LIVRE MERCADO - DESCONTOS");
            System.out.println("\n1 - AZUL         | 10% ");
            System.out.println("2 - VERDE       | 20% ");
            System.out.println("3 - AMARELO     | 30% ");
            System.out.println("4 - VERMELHO    | 40% ");
            System.out.println("5 - LARANJA     | 50% ");
            System.out.println("\nDigite O número correspondente a etiqueta de seu produto: ");
            int atividade = ler.nextInt();
            System.out.println("\nQual o valor de seu produto? ");
            float valor = ler.nextInt();
                switch (atividade) {
                              case 1:
                                double desconto1 = valor - (valor * 0.1);
                                System.out.println("\nO valor do seu produto com desconto é: R$" + desconto1);
                                break;
                              case 2:
                                double desconto2 = valor - (valor * 0.2);
                                System.out.println("\nO valor do seu produto com desconto é: R$" + desconto2);
                                break;
                              case 3:
                                double desconto3 = valor - (valor * 0.3);
                                System.out.println("\nO valor do seu produto com desconto é: R$" + desconto3);
                                break;
                              case 4:
                                double desconto4 = valor - (valor * 0.4);
                                System.out.println("\nO valor do seu produto com desconto é: R$" + desconto4);
                                break;
                              case 5:
                                double desconto5 = valor - (valor * 0.5);
                                System.out.println("\nO valor do seu produto com desconto é: R$" + desconto5);
                                break;
                              default:
                                System.out.println("\nO número escolhido é inválido! Digite um número entre 1 a 5.");
                }
        }
}
