public class HB20 implements Carro{
    
    String marca;
    String placa;
    long quilometragem;

    

    public HB20(String marca, String placa, long quilometragem) {
        this.marca = marca;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }



    @Override
    public void buzinar() {
        System.out.println("BIBI");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }
    
}
