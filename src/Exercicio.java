/**
 * @author gabriel-freitas
 */
public class Exercicio {
}
class Cachorro{

    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Cachorro(String nome, int idade, float altura, float peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    public void Som(){
        System.out.println("AU");
    }
    public void comer(){
        System.out.println("Comendo");
    }
}