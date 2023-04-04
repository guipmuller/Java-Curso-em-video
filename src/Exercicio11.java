import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Arrays.fill(vetor, 0);
        Scanner scan = new Scanner(System.in);
        int escolha; 
        int adicionaPosicao, adicionaValor;
        int removePosicao;
            do {
                
                System.out.println("Digite a opção: ");
                System.out.println("(1) Adicionar");
                System.out.println("(2) Remover");
                System.out.println("(3) Ordenar");
                System.out.println("(4) Sair");
                escolha = scan.nextInt();
                if (escolha == 1) {
                    System.out.print("Digite em qual posição deseja adicionar (0-9): ");
                    adicionaPosicao = scan.nextInt();
                    System.out.print("Digite o valor a ser adicionado na posição " + adicionaPosicao + ": ");
                    adicionaValor = scan.nextInt();
                    vetor[adicionaPosicao] = adicionaValor;
                } else if (escolha == 2) {
                    System.out.print("Digite em qual posição deseja remover (0-9): ");
                    removePosicao = scan.nextInt();
                    vetor[removePosicao] = 0;
                } else if (escolha == 3){
                    Arrays.sort(vetor);
                } else if (escolha !=4){
                    System.out.println("Opção inválida.");
                }
                System.out.println();
                for (int i : vetor) {
                    System.out.print(i + " ");
                }
                System.out.println();

            } while (escolha != 4);    

        }
    }
