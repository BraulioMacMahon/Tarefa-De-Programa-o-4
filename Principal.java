public class Principal{

public static void main(String[] args){

/*
 IPessoa aluno1 = new Aluno("ana", 1);
 Aluno aluno2 = new Aluno("Carlos", 2);
 Pessoa aluno3 = new Aluno("Pedro", 3);

 */

 Normal aluno1 = new Normal("Kahilo", 4, 40000);
 Cadeirante aluno2 = new Cadeirante("Jonas", 5, 40000, 7500, "É Cadeirante");


 Efetivo p1 = new Efetivo("Jose", 50000);
 Colaborador p2 = new Colaborador("Vatuva", 30000);

 System.out.println("O Aluno: "+ aluno1.getNome() + " - aluno Normal do IMETRO," + " Seu Professor: " + p2.getNome() + ", da-lhe Boa Avaliacao Positiva!");



}

}