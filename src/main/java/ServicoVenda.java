

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpfCliente, String cpfVendedor, double valorPago, String dataRegistro) throws Exception{
        Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpfCliente);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorCpf(cpfVendedor);

        Venda novaVenda = new Venda(cliente,vendedor,valorPago,dataRegistro);
        vendas.add(novaVenda);
        return novaVenda;
    }
    public static void exibirVendas(){
        System.out.println("Quantidade de vendas: "+vendas.size());
        for (Venda vendaReferencia : vendas){
            System.out.println("----------------------------");
            System.out.println(vendaReferencia);
        }
    }
    //Pesquisar e exibir compras do cliente por CPF
    public static List<Venda> exibirComprasCliente(String cpfCliente){
        List<Venda> comprasCliente = new ArrayList<>();
        for (Venda vendaReferencia : vendas){
            if (vendaReferencia.getCliente().getCpf().equals(cpfCliente)){
                comprasCliente.add(vendaReferencia);
            }
        }
        return comprasCliente;
    }
    //Pesquisar e exibir vendas do vendeddor por e-mail
    public static List<Venda> exibirVendasVendedorEmail(String emailVendedor){
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda vendaReferencia :vendas){
            if (vendaReferencia.getVendedor().getEmail().equals(emailVendedor)){
                vendasVendedor.add(vendaReferencia);
            }
        }
        return vendasVendedor;
    }
}
