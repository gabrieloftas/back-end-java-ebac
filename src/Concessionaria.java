import java.util.ArrayList;
import java.util.List;

public class Concessionaria<T> {
    
    List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        this.carros.add(carro);
    }

    public void mostrarCarros() {
        System.out.println(this.carros);
    }
}
