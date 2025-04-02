import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[4];
        // Entrada das notas 
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextFloat();
        }
        // Cálculo da média
        float media = 0;
        for (float n : notas) {
            media += n;
        }
        media = media/notas.length;
        if (media >= 7) {
            System.out.println("Aprovado");
        }
        else if (media >= 5) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}