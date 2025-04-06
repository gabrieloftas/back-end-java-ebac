public class Fiat extends Marca {
    String nome;

    public Fiat(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
