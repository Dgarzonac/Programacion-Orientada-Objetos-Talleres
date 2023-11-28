package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public int compareTo(Portero portero){
		return Math.abs(this.getGolesRecibidos() - portero.getGolesRecibidos());
	}
	public String toString(){
		return "El futbolista " + this.getNombre() +" tiene "+ this.getEdad()+ ", y juega de "+ this.getPosicion()+" con el dorsal "+ this.getDorsal()+ ". Le han marcado "+ this.getGolesRecibidos();
	}
	public short getGolesRecibidos(){
		return this.golesRecibidos;
	}
	
	public byte getDorsal(){
		return this.dorsal;
	}
	
	public void setGolesRecibidos(short golesRecibidos){
		this.golesRecibidos = golesRecibidos;
	}
	
	public void setDorsal(byte dorsal){
		this.dorsal = dorsal;
	}
	
	public static void main(String[] args){
		Portero p = new Portero("Santiago", 23, (short) 6, (byte) 8);
		System.out.println(p.toString());
	}
}
