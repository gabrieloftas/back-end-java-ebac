public class Aplicacao {
    
    private FabricaCarros fabrica;
    private Carro carro;

    public Aplicacao(FabricaCarros fabrica) {
        this.fabrica = fabrica;
        this.carro = this.fabrica.construirCarro();
    }

    public void buzinar(){
        carro.buzinar();
    }

    public void acelerar(){
        carro.acelerar();
    }

    public void frear(){
        carro.frear();
    }
}
