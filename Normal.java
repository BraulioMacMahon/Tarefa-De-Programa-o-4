public final class Normal extends Aluno {

    private float propina;

    public Normal(String nome, int id, float propina) {
        super(nome, id);
        this.propina = propina;
    }

    public void Propina(){

        if (this.propina != 0){
            System.out.println("Pago");
        }

        if (this.propina == 0 ){
            System.out.printf("divida");
        }

    }

    public float getPropina() {
        return propina;
    }

    public void setPropina(float propina) {
        this.propina = propina;
    }
}
