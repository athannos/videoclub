package prueba;

import java.io.*;

public class videojuego {
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private char genero;
	private String compañia;
	
	public videojuego(){
		horasEstimadas=10;
		entregado=false;
	}
	
	public videojuego(String titulo){
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
	}
	
	public videojuego(String titulo, int horasEstimadas, char genero, String compañia) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compañia=compañia;
	}
	
	public void entregar() {
		
	}

	public void devolver() {
		
	}
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	
	
}
