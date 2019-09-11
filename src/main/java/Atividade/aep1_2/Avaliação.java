package Atividade.aep1_2;

public class Avaliação {
     private String idAvaliação;
     private String disciplinaAvaliação;
   
     
     public Avaliação(String idAvaliação, String disciplinaAvaliação) {
    	 this.idAvaliação = idAvaliação;
    	 this.disciplinaAvaliação = disciplinaAvaliação;
     }
     
     public String getIdAvaliação() {
    	 return idAvaliação;
     }
     
     public String getDisciplinaAvaliação() {
		return disciplinaAvaliação;
	 }
     
     public void setDisciplinaAvaliação(String disciplinaAvaliação) {
		this.disciplinaAvaliação = disciplinaAvaliação;
	}
     
     public void setIdAvaliação(String idAvaliação) {
		this.idAvaliação = idAvaliação;
	}
     
}
