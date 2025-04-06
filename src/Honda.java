public class Honda extends Marca {
    String nome;

    public Honda(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
