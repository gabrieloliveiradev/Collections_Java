package main;

public class Aula {
		// cria��o das vari�veis
		private String titulo;
		private int tempo;
		
		//Cria��o do m�todo troca o valor das variaveis titulo e tempo
		public Aula(String titulo, int tempo) {
			this.titulo = titulo;
			this.tempo = tempo;
		}

		//met�dos getters e setter que s�o responsaveis por devolver e acessar o valor dos atributos desta classe
		public String getTitulo() {
			return titulo;
		}

		public int getTempo() {
			return tempo;
		}
}
