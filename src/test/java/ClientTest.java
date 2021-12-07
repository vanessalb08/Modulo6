import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ClientTest {

    @Test
    public void testarValidacaoDeEmailCaminhoNegativo() {
        Assert.assertThrows(Exception.class, () -> {
            ServicoCliente.verificarEmailValidoCliente("vanessa");
        });
    }

    @Test
    public void testarCadastroDeClienteCaminhoPositivo() {
        Cliente resultado = ServicoCliente.cadastrarCliente(
                "Vanessa",
                "707.770.190-51",
                "vanessa@google.com",
                "08/06");
        Assert.assertNotNull(resultado);

    }

    @Test
    public void testarPesquisarClienteCaminhoNegativo() {
        Assert.assertThrows(Exception.class, () -> {
            ServicoCliente.pesquisarClientePorCpf(
                    "707.770.190");
        });

    }

    @Test
    public void testarexibirCliente() {
       ServicoCliente.exibirClientesCadastrados();
    }

}
