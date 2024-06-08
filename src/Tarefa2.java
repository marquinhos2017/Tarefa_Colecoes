import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário para inserir nomes e gêneros separados por vírgula
        System.out.println("Insira os nomes e gêneros separados por vírgula (Ex: João-M, Maria-F):");
        String input = scanner.nextLine();

        // Divide a entrada em um array de nomes e gêneros
        String[] entradaArray = input.split(",");

        // Listas para armazenar nomes por gênero
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        // Processa cada entrada
        for (String entrada : entradaArray) {
            entrada = entrada.trim();
            String[] partes = entrada.split("-");
            String nome = partes[0].trim();
            String genero = partes[1].trim().toUpperCase();

            if (genero.equals("M")) {
                nomesMasculinos.add(nome);
            } else if (genero.equals("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Gênero inválido para o nome: " + nome);
            }
        }

        // Converte as listas para arrays e ordena
        String[] arrayMasculinos = nomesMasculinos.toArray(new String[0]);
        String[] arrayFemininos = nomesFemininos.toArray(new String[0]);

        Arrays.sort(arrayMasculinos);
        Arrays.sort(arrayFemininos);

        // Imprime os nomes ordenados por gênero
        System.out.println("Nomes masculinos ordenados:");
        for (String nome : arrayMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos ordenados:");
        for (String nome : arrayFemininos) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}
