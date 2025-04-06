public class Hyundai extends Marca {
    String nome;

    public Hyundai(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
