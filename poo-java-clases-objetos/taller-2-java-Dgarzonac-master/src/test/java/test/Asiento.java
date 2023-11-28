package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		if(color == "rojo" || color == "blanco" || color == "verde" || color == "amarillo" || color == "negro" )
		{
			this.color = color;
		}
	}
}