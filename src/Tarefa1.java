import java.util.Arrays;
import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário para inserir nomes separados por vírgula
        System.out.println("Insira os nomes separados por vírgula:");
        String input = scanner.nextLine();

        // Divide a entrada em um array de nomes e remove espaços extras
        String[] nomesArray = input.split(",");

        for (int i = 0; i < nomesArray.length; i++) {
            nomesArray[i] = nomesArray[i].trim();
        }

        // Ordena o array de nomes
        Arrays.sort(nomesArray);

        // Imprime os nomes ordenados no console
        System.out.println("Nomes ordenados:");
        for (String nome : nomesArray) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}
