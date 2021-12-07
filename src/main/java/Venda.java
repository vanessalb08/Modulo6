

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valorASerPago;
    private String dataDeRegistro;

    public Venda() {
    }

    public Venda(Cliente cliente, Vendedor vendedor, double valorASerPago, String dataDeRegistro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorASerPago = valorASerPago;
        this.dataDeRegistro = dataDeRegistro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("---Cliente---" + cliente);
        retornaDados.append("\n---Vendedor---" + vendedor);
        retornaDados.append("\nValor a ser pago: R$ "+ valorASerPago);
        retornaDados.append("\nData de registro: " + dataDeRegistro);
        return retornaDados.toString();
    }
}
