public class Main {
    public static void main(String[] args) {
       PessoaFisica p1 = new PessoaFisica("Gabriel", "456782190");
       PessoaJuridica p2 = new PessoaJuridica("EstudosFortesltda", "453154842154");
       System.out.println(p1.getCpf());
       System.out.println(p2.getCnpj());
    }
}

abstract class Pessoa {
    
    protected String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

class PessoaFisica extends Pessoa{
    
    protected String cpf;
    
    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;

    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    
}

class PessoaJuridica extends Pessoa{

    protected String cnpj;

    public PessoaJuridica(String nome,String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}