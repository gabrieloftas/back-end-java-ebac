public class FabricaLancer implements FabricaCarros {


    @Override
    public void projetarCarro() {
        System.out.println("Projetando");
    }

    @Override
    public Carro construirCarro() {
        return new Lancer( "Mitsubishi Motors", "45135456", 0);
    }

    @Override
    public boolean transporteConcessionaria() {
        return true;
    }
    
}
