import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void ExemploListaSimples(){
        System.out.println("Exemplos");
        List<String> lista = new ArrayList<>();
        lista.add("Gabriel");
        lista.add("Nicole");
        lista.add("LOL");
        lista.add("Master Duel");
        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println(lista.toString());
    }
}
