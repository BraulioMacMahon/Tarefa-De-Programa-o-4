public abstract class Pessoa implements IPessoa {

protected String nome;

public Pessoa(String nome){

this.nome = nome;

}

public void setNome(){
this.nome = nome;

}


   @Override
   public abstract void presenca();



    public String getNome(){
return this.nome;
}

}