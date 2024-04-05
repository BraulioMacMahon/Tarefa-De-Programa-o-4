public class Aluno extends Pessoa{
private final int id;


public Aluno(String nome, int id){

super(nome);
this.id = id;


}


public void pagarPropina(String mes){


System.out.println(mes);

}

public void assistirAula(String disciplina){

System.out.println(disciplina);

}

public void setId(){

}

public int getId(){

return this.id;

}
@Override
public void presenca(){

    System.out.println("Folha A4");

}




}