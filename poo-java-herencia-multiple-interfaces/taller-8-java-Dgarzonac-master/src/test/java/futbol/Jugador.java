package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados ;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal)
	{
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador(){
		super();
        this.golesMarcados = 289;
        this.dorsal = 7;
	}
	public int compareTo(Jugador jugador) {
		return Math.abs(this.getEdad() - jugador.getEdad());
	}
	
	public short getGolesMarcados(){
		return this.golesMarcados;
	}
	
	public byte getDorsal(){
		return this.dorsal;
	}
	
	public void setGolesMarcados(short golesMarcados){
		this.golesMarcados = golesMarcados;
	}
	
	public void setDorsal(byte dorsal){
		this.dorsal= dorsal;
	}
	public String toString(){
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal "+ this.getDorsal() + ". Ha marcado " + this.getGolesMarcados();
	}
}
