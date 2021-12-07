

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();

    //Cadastrar Vendedor e adicioná-lo a lista de vendedores
    public static Vendedor cadastrarVendedores(String nomeVendedor, String cpfVendedor, String emailVendedor, String ctps){
        Vendedor novoVendedor = new Vendedor(nomeVendedor, cpfVendedor,emailVendedor,ctps);
        vendedores.add(novoVendedor);
        return novoVendedor;
    }
    //Verificar email válido
    public static void verificarEmailValidoVendedor(String emailVendedor) throws Exception{
        if (!emailVendedor.contains("@")){
            throw new Exception("E-mail inválido! Por favor digite um email válido.");
        }
    }
    //Verificar cpf repetido vendedor
    public static void verificarCpfRepetidoVendedor(String cpfVendedor) throws Exception{
        for (Vendedor vendedorReferencia : vendedores){
            if (vendedorReferencia.getCpf().equals(cpfVendedor)) {
                throw new Exception("Esse CPF já está cadastrado em nossa base!");
            }
        }
    }

    //Verificar email repetido
    public static void verificarEmailRepetidoVendedor(String emailVendedor) throws Exception{
        for (Vendedor vendedorReferencia : vendedores){
            if (vendedorReferencia.getEmail().equalsIgnoreCase(emailVendedor)){
                throw new Exception("Já existe vendedor cadastrado com esse e-mail.");
            }
        }
    }
    //Pesquisar vendedor pelo cpf
    public static Vendedor pesquisarVendedorPorCpf(String cpf) throws Exception{
        for (Vendedor vendedorReferencia : vendedores){
            if (vendedorReferencia.getCpf().equals(cpf)){
                return vendedorReferencia;
            }
        }
        throw new Exception("Vendedor não encontrado na nossa base. Por favor, digite novamente!");
    }
    //Pesquisar vendedor por e-mail
    public static Vendedor pesquisarVendedorPorEmail(String emailVendedor) throws Exception{
        for (Vendedor vendedorReferencia : vendedores){
            if (vendedorReferencia.getEmail().equals(emailVendedor)){
                return vendedorReferencia;
            }
        }
        throw new Exception("Vendedor não encontrado na nossa base. Por favor, digite novamente!");

    }

    //Exibir todas os vendedores cadastrados
    public static void exibirVendedoresCadastrados(){
        System.out.println("Quantidade de vendedores: "+ vendedores.size());
        for (Vendedor vendedorReferencia : vendedores){
            System.out.println("----------------------------");
            System.out.println(vendedorReferencia);
        }
    }
}
