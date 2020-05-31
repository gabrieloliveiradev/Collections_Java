package main;

public class Aula {
		// criação das variáveis
		private String titulo;
		private int tempo;
		
		//Criação do método troca o valor das variaveis titulo e tempo
		public Aula(String titulo, int tempo) {
			this.titulo = titulo;
			this.tempo = tempo;
		}

		//metódos getters e setter que são responsaveis por devolver e acessar o valor dos atributos desta classe
		public String getTitulo() {
			return titulo;
		}

		public int getTempo() {
			return tempo;
		}
}
