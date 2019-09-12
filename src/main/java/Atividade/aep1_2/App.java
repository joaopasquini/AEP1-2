package Atividade.aep1_2;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Conceito> conceitos = new ArrayList<Conceito>();
        
        Aluno a1 = new Aluno("001","João",23,"sexta série");
        Aluno a2 = new Aluno("002","Danielle",19,"sexta série");
        Aluno a3 = new Aluno("003","Everton",19,"quinta série");
        Aluno a4 = new Aluno("004","Maria",27,"quinta série");
        
    	Avaliação av1 = new Avaliação("001","Matemática");
    	Avaliação av2 = new Avaliação("002","Português");
    	
    	Conceito c001 = new Conceito("001",av1,a1,9);
    	Conceito c002 = new Conceito("002",av1,a2,9.5f);
    	Conceito c003 = new Conceito("003",av2,a3,7.2f);
    	Conceito c004 = new Conceito("004",av2,a4,8.4f);
    	
    	conceitos.add(c001);
    	conceitos.add(c002);
    	conceitos.add(c003);
    	conceitos.add(c004);
    	
    	apresentarMédiaGeralDaTurmaNoConsole(conceitos,"sexta série");
    	apresentarMédiaGeralDaTurmaNoConsole(conceitos,"quinta série");
    	
    	apresentarMédiaDaEscolaPorDisciplinaNoConsole(conceitos,"Português");
    	apresentarMédiaDaEscolaPorDisciplinaNoConsole(conceitos,"Matemática");
    	
    	//runtimeException nota invalida, deve ser entre 0 e 10.
    	//Conceito c005 = new Conceito("005",av1,a3,12f);
    	
    	//runtimeException poucos argumentos, avaliação e aluno devem ser informados
    	//Conceito c006 = new Conceito("005",null,null,12f);
    	
    	
    	
    }
    public static void apresentarMédiaGeralDaTurmaNoConsole(List<Conceito> conceito, String série) {
    	float somaDasNotas = 0;
    	int contadorDeAlunos = 0;
    	
    	for(Conceito c : conceito) {
    		if (c.getAluno().getSérie() == série) {
    		  	somaDasNotas += c.getNota().getNota();
    		    contadorDeAlunos += 1;
    		}
    	}
    	System.out.println("\nNota média da "+série+" : "+(somaDasNotas/contadorDeAlunos));
    }
    
    public static void apresentarMédiaDaEscolaPorDisciplinaNoConsole(List<Conceito> conceito, String disciplinaAvaliação) {
    	float somaDasNotas = 0;
    	int contadorDeAlunos = 0;
    	
    	for(Conceito c : conceito) {
    		if (c.getAvaliação().getDisciplinaAvaliação() == disciplinaAvaliação) {
    		  	somaDasNotas += c.getNota().getNota();
    		    contadorDeAlunos += 1;
    		}
    	}
    	System.out.println("\nNota média da Escola na disciplina "+disciplinaAvaliação+" : "+(somaDasNotas/contadorDeAlunos));
    }
    
    
    
}
