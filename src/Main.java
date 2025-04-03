import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes = Arrays.asList(scanner.next().split(","));
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);

        List<String> listaNomesComSexo = new ArrayList<>();
        listaNomesComSexo= Arrays.asList(scanner.next().split(","));
        System.out.println(listaNomesComSexo);
            List<String> listaM = new ArrayList<>();
            List<String> listaF = new ArrayList<>();
        for (String string2 : listaNomesComSexo) {
            if (string2.substring(string2.length()-1).equals("M")) {
                String nome = string2.substring(0,string2.length()-1);
                listaM.add(nome);
            }
            else if (string2.substring(string2.length()-1).equals("F")) {
                String nome = string2.substring(0,string2.length()-1);
                listaF.add(nome);
            }
        }
        System.out.println(listaM);
        System.out.println(listaF); 
           
        }
    }