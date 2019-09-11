package Atividade.aep1_2;

public class Nota {
   private float nota;
   
   public Nota(float nota) {
	   validarNota(nota);
	   this.nota = nota;
   }
   
   public void setNota(float nota) {
	   validarNota(nota);
	   this.nota = nota;
   }
   
   public void validarNota(float nota) {
	   if(nota < 0 || nota > 10) {
		   throw new RuntimeException("\n Erro! Nota invalida.");
	   }
   }
   
   public float getNota() {
	   return this.nota;
   }
}
