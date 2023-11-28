package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int numero) {
		return numero*getPaginas();
	}
	
	public String toString(){
	    return getOrigen() + "\n" + getTitulo()  + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getEnsenanza() ;
	}
	
	public String getEnsenanza() {
		return this.ensenanza;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}

