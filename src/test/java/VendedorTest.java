import org.junit.Assert;
import org.junit.Test;

public class VendedorTest {

    @Test
    public void testarCadastrarVendedorCaminhoPositivo(){
        Vendedor vendedor = new Vendedor(
                "Carlos",
                "641.706.530-84",
                "carlos@gmail.com",
                "329148473849"
        );
        Assert.assertNotNull(vendedor);

    }

    @Test
    public void testarVerificarEmailValidoVendedorCaminhoNegativo(){
        Assert.assertThrows(Exception.class, ()->{
            ServicoVendedor.verificarEmailValidoVendedor(
                    "carlos");
        });

    }

    @Test
    public void testarPesquisarVendedorPorCpfCaminhoPositivo(){
        Assert.assertThrows(Exception.class, ()->{
           ServicoVendedor.pesquisarVendedorPorCpf(
                   "641.706.530-84"
           );

        });

    }

    @Test
    public void testarPesquisarVendedorPorEmailCaminhoNegativo(){
        Assert.assertThrows(Exception.class, ()->{
            ServicoVendedor.pesquisarVendedorPorCpf(
                    "vanessa@google.com"
            );

        });

    }
}
