package prueba;

import java.io.*;

public class videojuego {
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private char genero;
	private String compa�ia;
	
	public videojuego(){
		horasEstimadas=10;
		entregado=false;
	}
	
	public videojuego(String titulo){
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
	}
	
	public videojuego(String titulo, int horasEstimadas, char genero, String compa�ia) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compa�ia=compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
	
	
}
