package com.example.humano;

public class Humano {
 private int edad;
 private int peso;
 private int altura;
 private String nombre;
	
	public Humano (int Edad,int Peso,int Altura,String Nombre){
		this.edad=Edad;
		this.altura=Altura;
		this.peso=Peso;
		this.nombre=Nombre;
		
		}
	
	public void asignarEdad(int Edad){
		this.edad=Edad;
	}
	
	public int obtenerEdad(){
			return edad;
	}
	
	public void asignarPeso(int Peso){
		this.peso=Peso;
	}
	
	public int obtenerPeso(){
			return peso;
	}
	public void asignarAltura(int Altura){
		this.altura=Altura;
	}
	
	public int obtenerAltura(){
			return altura;
	}
	public void asignarNombre(String Nombre){
		this.nombre=Nombre;
	}
	
	public String obtenerNombre(){
			return nombre;
	}
}
