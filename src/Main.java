

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Itable annotation = table.getClass().getAnnotation(Itable.class);
        String nomeTabela = annotation.value();

        System.out.println(nomeTabela);
        
    }
}