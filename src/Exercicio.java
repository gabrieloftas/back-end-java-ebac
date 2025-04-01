import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        float[] nota = new float[4];
        
        for (int i = 0; i < nota.length; i++) {
            
            nota[i] = scanner.nextFloat();
            
        }
        
        float nota_total = 0;
        for (float n : nota) {
            
            nota_total += n;

        }
        System.out.println("A média é : " + nota_total/nota.length);
    }
}