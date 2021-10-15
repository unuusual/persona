package ar.edu.unlam.dominio;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	public Persona(String nombre, String genero, long dni, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.viva = viva;
	}
	
	
	//hacemos un metodo llamado ALIMENTAR, en donde por parametros (o sea por los parentesis)
	//le vamos a pasar un valor numerico, en este caso, los kilos
	public void alimentar(double kilos) {
		this.peso += kilos; 
		//aca lo que hacemos es decir que al peso que tenia antes
		//o sea "this.peso" le sumamos el numero que le pasamos por parametros.
		//ejemplo: si sofia pesaba 2kg, y por parametro le pasamos 3kg, entonces ahora tiene 5kg, se le suma el valor
		
		
	}
	
	
	//hacemos un metodo llamado CRECER, en donde por parametros (o sea por los parentesis)
	//le vamos a pasar un valor numerico, en este caso, los metros
	public void crecer(double metros) {
		this.altura += metros;
		//aca lo que hacemos es decir que la altura que tenia antes
		//o sea "this.altura" le sumamos el numero que le pasamos por parametros.
		//ejemplo: si sofia media 2mts, y por parametro le pasamos 1mts, entonces ahora tiene 3mts, se le suma el valor
		//es parecido al metodo de alimentar
	}
	
	
	//hacemos un metodo llamado CUMPLIRANOS
	//aca no le pasamos ningun valor por parametros
	//unicamente al ejecutarlo en el MAIN, este metodo automaticamente suma 1 a la edad
	public void cumplirAnos() {
		this.edad ++;
		//con el "this.edad ++;" estamos diciendo que se le suma 1 valor numerico a la edad que tenia antes
		//por ejemplo: si sofia tenia 5 años, y en el main escribimos esto: "sofia.cumplirAnos();"
		//entonces automaticamente se le suma 1 año a sofia, entonces tendria 6 años.
	}
	
	
	//hacemos un metodo que se llame morir
	//al escribir sofia.morir();
	//sofia automaticamente muere
	public void morir() {
		this.viva = false;
	}
	
	
	//este metodo nos devuelve el peso que tiene sofia
	public double pesar() {
		return this.peso;
	}
	
	//este metodo nos devuelve la altura que tiene sofia
	public double medir() {
		return this.altura;
	}
	
	//este metodo nos devuelve los años que tiene sofia
	public int decirAnios() {
		return this.edad;
	}
	
	
}
