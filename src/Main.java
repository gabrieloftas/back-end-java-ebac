public class Main {
    public static void main(String[] args) {
        
        System.out.println("Criação do Lancer");
        
        Aplicacao aplicacao = new Aplicacao(new FabricaLancer());

        aplicacao.buzinar();
        aplicacao.acelerar();
        aplicacao.frear();

        System.out.println("Criação do HB20");
        
        aplicacao = new Aplicacao(new FabricaHB20());

        aplicacao.buzinar();
        aplicacao.acelerar();
        aplicacao.frear();
    }
}