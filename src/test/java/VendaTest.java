import org.junit.Assert;
import org.junit.Test;

public class VendaTest {
    @Test
    public void testarCadastrarVenda(){
        Assert.assertThrows(
                Exception.class, ()-> {
                    ServicoVenda.cadastrarVenda(
                            "707.770.190-51",
                            "641.706.530-84",
                            123.3,
                            "24/08");
                });

    }

    @Test
    public void testarExibirVendas() {
        ServicoVenda.exibirVendas();
    }

    @Test
    public void testarExibirComprasClientePorCPF() {
        Assert.assertNotNull(ServicoVenda.exibirComprasCliente(
                "641.706.530-84"));

    }

    @Test
    public void testarExibirVendasVendedorEmail() {
        Assert.assertNotNull(ServicoVenda.exibirVendasVendedorEmail(
                    "carlos@gmail.com"));
        }

}
