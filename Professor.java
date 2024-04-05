public class Professor extends Pessoa{

        private float salario;

        public Professor(String var1, float var2) {
            super(var1);
            this.salario = var2;
        }

        public void darAula(String var1) {
            System.out.println(var1);
        }

        public void setsalario() {
            this.salario = this.salario;
        }

        public float getSalario() {
            return this.salario;
        }


    @Override
    public void presenca() {

    }
}