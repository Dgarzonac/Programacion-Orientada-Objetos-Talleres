package taller3.televisores;

public class TV {
	private Marca marca;
	private Control control;
	int canal = 1;
	int volumen = 1;
	private int precio = 500;
	boolean estado;
	public static int numTV = 0;
	TV tv;
	
	public TV(Marca marca, boolean estado)
	{
		this.marca = marca;
		this.estado= estado;
		numTV++;
	}
	public void setControl(Control control)
	{
		this.control = control;
	}
	public void canalUp()
	{
		if(estado)
		{
			if(canal<120)
			{
				canal++;
			}
		}
	}
	public void canalDown()
	{
		if(estado)
		{
			if(canal>1)
			{
				canal--;
			}
		}
	}
	public void setCanal(int canal)
	{
		if (estado)
		{
			if(canal>=1 & canal<=120)
			{
				this.canal = canal;
			}
		}
	}
	public void setVolumen(int volumen)
	{
		if(estado)
		{
			if(volumen>=0 & volumen<=7)
			{
				this.volumen = volumen;
			}
		}
	}
	public void volumenUp()
	{
		if (estado)
		{
			if(volumen<7)
			{
				volumen++;;
			}
		}
	}
	public void volumenDown()
	{
		if (estado)
		{
			if(volumen>0)
			{
				volumen--;
			}
		}		
	}
	public void turnOn()
	{
		this.estado=true;
	}
	public void turnOff()
	{
		this.estado=false;
	}
	public void setMarca(Marca marca)
	{
		this.marca = marca;
	}
	public void setPrecio(int precio)
	{
		this.precio = precio;
	}
	public static void setNumTV(int numTV)
	{
		TV.numTV = numTV;
	}	
	public Marca getMarca()
	{
		return marca;
	}
	
	public int getCanal()
	{
		return canal;
	}
	
	public int getPrecio()
	{
		return precio;
	}
	
	public int getVolumen()
	{
		return volumen;
	}
	public Control getControl()
	{
		return control;
	}
	public boolean getEstado()
	{
		return estado;
	}
	public Object getTV()
	{
		return tv;
	}
	public static int getNumTV()
	{
		return numTV;
	}

}