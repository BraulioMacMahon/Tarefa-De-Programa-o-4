public class Cadeira extends Aluno{

    private float propina;
    private float cadeira;

    public Cadeira(String nome, int id, float propina, float cadeira) {
        super(nome, id);
        this.propina = propina;
        this.cadeira = cadeira;
    }

    public void Propina(){

        if (this.propina != 0){
            if (this.cadeira !=0){
                System.out.println("Pago");
            }
        }

        else {
            System.out.printf("divida");
        }

    }

}
