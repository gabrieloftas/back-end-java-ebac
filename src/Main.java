/**
 * Testando comentarios da aplicação
 */

/**
 * @author gabriel-freitas
 */

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Olá Rodrigo");
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
    // Testando Comentário
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
        cliente.imprimirEndereco();

        /*Comentando
        em
        bloco
         */
    }
}