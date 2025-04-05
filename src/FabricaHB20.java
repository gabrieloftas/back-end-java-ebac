public class FabricaHB20 implements FabricaCarros {

    @Override
    public void projetarCarro() {
        System.out.println("Projetando");
    }

    @Override
    public Carro construirCarro() {
        return new Lancer( "Hyundai", "45153515", 0);
    }

    @Override
    public boolean transporteConcessionaria() {
        return true;
    }
}
