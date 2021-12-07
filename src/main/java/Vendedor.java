

public class Vendedor extends Pessoa{
    private String ctps;

    public Vendedor() {

    }

    public Vendedor(String nome, String cpf, String email, String ctps) {
        super(nome, cpf, email);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append(super.toString());
        retornaDados.append("\nCTPS: "+ ctps);
        return retornaDados.toString();
    }
}
