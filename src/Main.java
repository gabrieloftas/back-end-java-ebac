import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> entrada = new ArrayList<>();
        List<Pessoas> pessoas = new ArrayList<>();                      
        
        entrada = Arrays.asList(scanner.next().split(","));

        for (int i = 0; i < entrada.size() ; i=i+2) {
            Pessoas p = new Pessoas(entrada.get(i), entrada.get(i+1));
            pessoas.add(p);        
        }

        System.out.println(pessoas);

        //Stream pessoasPorSexo = pessoas.stream();
        
        Ifiltro filtroPorSexo = ()->{
            return pessoas.stream()
                    .filter(p -> p.getSexo().equals("Feminino"))
                    .toList();
        };

        List<Pessoas> PessoasDoSexoFeminino = filtroPorSexo.filtro();

        System.out.println(PessoasDoSexoFeminino);

        scanner.close();
    }
    
} 


