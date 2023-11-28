package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static List<Mamifero> mamiferos = new ArrayList<>();
	
	public Mamifero(String nombre,int edad,String habitat,String  genero, boolean pelaje, int patas){
		super(nombre, edad, habitat, genero);
		this.patas=patas;
		mamiferos.add(this);
	}
	public Mamifero(){
		super();
		mamiferos.add(this);
	}
	public static Mamifero crearCaballo(String nombre,int edad,String genero){
		caballos++;
		return new Mamifero(nombre, edad,"pradera",genero,true, 4);
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero){
		leones++;
		return new Mamifero(nombre, edad,"selva",genero,true,4);
	}
	public String movimiento(){
		return "desplazarse";
	}
	public static int cantidadMamiferos(){
		return (mamiferos.size()) ;
	}
	public int getPatas(){
		return patas;
	}
	public void setPatas(int patas){
		this.patas = patas;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

}
