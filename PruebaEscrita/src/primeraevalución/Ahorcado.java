package primeraevalución;

import java.util.Arrays;

public class Ahorcado {

//propiedades 
	private static String [] diccionario = { "pelota ","caramelo ", "payaso "};
	private String palabraAdivinar ; 
	private char [] palabraIntentada; 
	private char [] letrasProbadas ; 
	private int fallos ;
	
	public Ahorcado () {
		int posicion = (int)( Math.random() * Ahorcado.diccionario.length); 
		this.palabraAdivinar = Ahorcado.diccionario[posicion]; 
		
		//reservo tantos caracteres para la palabraintentada como longitud de palabraAdivinar 
		
		this.palabraIntentada = new char [ this.palabraAdivinar.length() ]; 
		
		//rellenar los guiones la palabraintentada tantos como la longitud de palabraAdivinar 
		
		for (int i=0 ; i<this.palabraAdivinar.length() ; i++) {
			this.palabraIntentada[i] = '-' ; 
		}
		
		//iniciar el tamaño del array de letras palabras 
		
		this.letrasProbadas = new char[27] ; 
		this.fallos = 0 ; 
	}
	

	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}


	/**
	 * @param diccionario the diccionario to set
	 */
	public static void setDiccionario(String[] diccionario) {
		Ahorcado.diccionario = diccionario;
	}


	/**
	 * @return the palabraAdivinar
	 */
	public String getPalabraAdivinar() {
		return palabraAdivinar;
	}


	/**
	 * @param palabraAdivinar the palabraAdivinar to set
	 */
	public void setPalabraAdivinar(String palabraAdivinar) {
		this.palabraAdivinar = palabraAdivinar;
	}


	/**
	 * @return the palabraIntentada
	 */
	public char[] getPalabraIntentada() {
		return palabraIntentada;
	}


	/**
	 * @param palabraIntentada the palabraIntentada to set
	 */
	public void setPalabraIntentada(char[] palabraIntentada) {
		this.palabraIntentada = palabraIntentada;
	}


	/**
	 * @return the letrasProbadas
	 */
	public char[] getLetrasProbadas() {
		return letrasProbadas;
	}


	/**
	 * @param letrasProbadas the letrasProbadas to set
	 */
	public void setLetrasProbadas(char[] letrasProbadas) {
		this.letrasProbadas = letrasProbadas;
	}


	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}


	/**
	 * @param fallos the fallos to set
	 */
	public void setFallos(int fallos) {
		this.fallos = fallos;
	}


	@Override
	public String toString() {
		return "Ahorcado [palabraAdivinar=" + palabraAdivinar + ", palabraIntentada="
				+ Arrays.toString(palabraIntentada) + ", letrasProbadas=" + Arrays.toString(letrasProbadas)
				+ ", fallos=" + fallos + "]";
	}

  public boolean intentar(char letra) {
	//buscar la letra tantas veces como salga 
	 boolean encontrado = false ; 
	 for (int i=0 ; i<this.palabraAdivinar.length(); i++) {
		 if( this.palabraAdivinar.charAt(i)== letra ) {
			 this.palabraIntentada[i] = letra ; 
			 encontrado = true ; 
		 }
	 }
	if (encontrado == false )
		this.fallos++; 
	
	 return encontrado ; 
  }
  
  public boolean solucion() {
	  boolean solucionado = true ; 
	  for (int i=0 ; i<this.palabraAdivinar.length() ; i++) {
		  if (this.palabraAdivinar.charAt(i) != this.palabraIntentada[i]) {
			  solucionado = false ; 
		  }
	  }
	  return solucionado ; 
  }
  
  
  




	
	




	}
	
	
 

