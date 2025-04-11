import java.util.List;

public class Pessoas {
    String nome;
    String sexo;
    public Pessoas(String nome, String sexo) {
        this.nome = nome;

        if (sexo.equals("M")) {
            sexo = "Masculino";
        }
        else if (sexo.equals("F")) {
            sexo = "Feminino";
        }
        else {sexo = "Não Identificado";}

        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Sexo: " + sexo;
    }

    public static boolean somenteMulheres(List<Pessoas> lista) {
        boolean flag = true;
        for(Pessoas pessoa:lista) {
            if (pessoa.getSexo().equals("Masculino")) {
                flag = false;
            }
        }

        return flag;
    }
}

