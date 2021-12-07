

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    //Verificar e-mail válido
    public static void verificarEmailValidoCliente(String emaiCliente) throws Exception{
            if (!emaiCliente.contains("@")){
                throw new Exception("E-mail inválido! Por favor digite um email válido.");
            }
    }
    //Verificar CPF repetido
    public static void verificarCpfRepetidoCliente(String cpfCliente) throws Exception{
        for (Cliente clienteReferencia : clientes){
            if (clienteReferencia.getCpf().equals(cpfCliente)){
                throw new Exception("Esse CPF já está cadastrado em nossa base!");
            }
        }
    }
    public static void verificarEmailRepetidoCliente(String emailCliente)throws Exception{
        for (Cliente clienteReferencia :clientes){
            if (clienteReferencia.getEmail().equalsIgnoreCase(emailCliente)){
                throw new Exception("Já existe cliente cadastrado com esse e-mail.");
            }
        }
    }
    //Cadastrar cliente e adicioná-lo a lista de clientes
    public static Cliente cadastrarCliente(String nomeCliente, String cpfCliente, String emailCliente, String dataNascimento){
        Cliente novoCliente = new Cliente(nomeCliente,cpfCliente,emailCliente,dataNascimento);
        clientes.add(novoCliente);
        return novoCliente;
    }
    //Pesquisar cliente pelo CPF
    public static Cliente pesquisarClientePorCpf(String cpfCliente) throws Exception{
        for (Cliente clienteReferencia : clientes){
            if (clienteReferencia.getCpf().equals(cpfCliente)){
                return clienteReferencia;
            }
        }
        throw new Exception("Cliente não encontrado na nossa base. Por favor, digite novamente!");
    }
    //Exibir clientes cadastrados
    public static void exibirClientesCadastrados(){
        System.out.println("Quantidade de clientes: "+clientes.size());
        for (Cliente clienteReferencia : clientes){
            System.out.println("----------------------------");
            System.out.println(clienteReferencia);
        }
    }
}
