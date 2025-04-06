public class Main {
    public static void main(String[] args) {
        Concessionaria<Object> concessionaria = new Concessionaria<>();
        
        concessionaria.adicionarCarro(new Fiat("Subaru"));
        concessionaria.adicionarCarro(new Hyundai("João"));
        concessionaria.adicionarCarro(new Honda("Vitor"));
        
        concessionaria.mostrarCarros();
    }
}