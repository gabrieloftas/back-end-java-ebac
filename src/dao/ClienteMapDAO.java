package dao;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import domain.Cliente;

public class ClienteMapDAO implements IClienteDAO {
    
    private Map<String, Cliente> map;
    
    public ClienteMapDAO(){
        map = new TreeMap<>();
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setCpf(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public Cliente consultar(String cpf) {
        return this.map.get(cpf);
    }

    @Override
    public void excluir(String cpf) {
        try {
            Cliente clienteCadastrado = map.get(cpf);
            map.remove(clienteCadastrado.getCpf(),clienteCadastrado);
        } catch (Exception e) {
            System.err.print("Cliente não Encontrado");
        }
    
        
    }
}
