package Atividade.aep1_2;


public class Aluno {
    private String idMatricula;
    private String nome;
    private int idade;
    private String série;
    
    public Aluno(String idMatricula, String nome,int idade, String série ) {
    	if(idade <0) {
    		throw new RuntimeException("\n Erro! Idade deve ser maior que 0.");	
    	}
    	this.idMatricula = idMatricula;
    	this.nome = nome;
    	this.idade = idade;
    	this.série = série;
    }
    
    
    
    public String getMatricula() {
    	return idMatricula;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public int getIdade() {
    	return idade;
    }
    
    public String getSérie(){
    	return série;
    }
}
