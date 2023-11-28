package test;

public class Auto {
	int precio;
	int registro;
	String marca;
	String modelo;
	Motor motor;
	Asiento [] asientos;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		int numAsientos=0;
		
		for(int i = 0 ; i < asientos.length; i++ )
		{
			if(asientos[i] !=null) 
			{
				numAsientos++;
			}
		}
		return numAsientos;
	}
	String verificarIntegridad()
	{
		boolean verificador = true;
		if (motor.registro !=registro )
		{	
			verificador = false;
		}
		for(int i = 0 ; i < asientos.length; i++ )
		{
			if (asientos[i] != null  && asientos[i].registro!=registro)
			{
				verificador=false;
				break;
			}
		}
		if(verificador)
		{
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
		
	}
}
