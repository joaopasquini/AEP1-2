package Atividade.aep1_2;

public class Conceito {
   private String idConceito;
   private Avaliação avaliação;
   private Aluno aluno;
   private Nota nota;
   
   public Conceito(String idConceito, Avaliação avaliação, Aluno aluno, float nota) {
	   this.idConceito = idConceito;
	   this.avaliação = avaliação;
	   this.aluno = aluno;
	   this.nota = new Nota(nota);
   }
   
   public Aluno getAluno() {
	return aluno;
   }
   
   public String getIdConceito() {
	return idConceito;
   }
   
   public Nota getNota() {
	return nota;
   }
   
   public Avaliação getAvaliação() {
	return avaliação;
   }
   
   public void setAvaliação(Avaliação avaliação) {
	this.avaliação = avaliação;
   }
   
   public void setNota(Nota nota) {
	this.nota = nota;
   }
   
   public void setIdConceito(String idConceito) {
	this.idConceito = idConceito;
   }
   
   
}
