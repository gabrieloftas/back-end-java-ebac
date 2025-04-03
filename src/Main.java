import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes = Arrays.asList(scanner.nextLine().split(","));
        
        Map <String,List<String>> MapaSexo = new HashMap<>();
        MapaSexo.put("M", new ArrayList<String>());
        MapaSexo.put("F", new ArrayList<String>());

        for (String pessoa : listaDeNomes) {
            String nome = pessoa.substring(0,pessoa.length()-1);
            String sexo = pessoa.substring(pessoa.length()-1);
            Pessoa p = new Pessoa(nome,sexo);
            MapaSexo.get(p.sexo).add(p.nome);
            
        }
        System.out.println(MapaSexo);

        scanner.close();
    }
}
class Pessoa {
    String nome;
    String sexo;

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }


}