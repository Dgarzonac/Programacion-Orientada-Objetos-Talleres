package futbol;

public  class Futbolista {
	private String nombre; 
	private int edad;
	final private String posicion;
	
	
	public Futbolista(String nombre, int edad, String posicion){
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public String toString() {
		return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
	}
	
	public boolean equals(Futbolista f, Futbolista f1){
		return (f).equals(f1);
	}
	
	
	public boolean jugarConLasManos() {
		return this.getPosicion().equals("Portero");
	}
		
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}

	public String getPosicion(){
	return this.posicion;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
