package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private static List<Ave> aves = new ArrayList<>();
	
	public Ave(String nombre,int edad,String habitat,String  genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		aves.add(this);
	}
	public Ave(){
		super();
		aves.add(this);
	}
	public static Ave crearHalcon(String nombre,int edad, String genero){
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso" );
	}
	public static Ave crearAguila(String nombre,int edad, String genero){
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo" );
	}
	public String movimiento(){
		return "volar";
	}
	public static int cantidadAves(){
		return (aves.size()) ;
	}
	public String getColorPlumas(){
		return colorPlumas;
	}
}
