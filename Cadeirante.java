public final class Cadeirante extends Cadeira{

    private String cadeirante;

    public Cadeirante(String nome, int id, float propina, float cadeira, String cadeirante) {
        super(nome, id, propina, cadeira);
        this.cadeirante = cadeirante;
    }

    public String getCadeirante() {
        return cadeirante;
    }

    public void setCadeirante(String cadeirante) {
        this.cadeirante = cadeirante;
    }
}
