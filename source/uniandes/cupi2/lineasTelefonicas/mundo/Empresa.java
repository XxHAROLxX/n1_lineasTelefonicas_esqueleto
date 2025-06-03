/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_lineasTelefonicas
 * Autor: Equipo Cupi2
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 * Clase que representa la empresa.
 */
public class Empresa
{

    //-----------------------------------------------------------------
    // Atributos 
    //-----------------------------------------------------------------

    /**
     * L�neas telef�nicas.
     */
    private LineaTelefonica[] lineas = new LineaTelefonica[3]; // Array que contendra las 3 lineas telefonicas

    // --------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Inicializa las l�neas telef�nicas de la empresa. <br>
     * <b>post: </b> Se inicializaron las 3 l�neas telef�nicas.
     */
    public Empresa( ) // Constructor de la clase
    {
    	// Inicialize la 3 instancias de la clase empresa
        this.lineas[0] = new LineaTelefonica();
        this.lineas[1] = new LineaTelefonica();
        this.lineas[2] = new LineaTelefonica();
    }

    /**
     * Retorna la l�nea 1.
     * @return L�nea 1.
     */
    public LineaTelefonica darLinea1( )
    {
    	return this.lineas[0]; // Metodo getter para enviar informaci�n al usuario
 
    }

    /**
     * Retorna la l�nea 2.
     * @return L�nea 2.
     */
    public LineaTelefonica darLinea2( )
    {
        return this.lineas[1]; // Metodo getter para enviar informaci�n al usuario
 
    }

    /**
     * Retorna la l�nea 3.
     * @return L�nea 3.
     */
    public LineaTelefonica darLinea3( )
    {
    	return this.lineas[2]; // Metodo getter para enviar informaci�n al usuario
  
    }

    /**
	 * Retorna el n�mero total de llamadas realizadas.
	 * @return Total de llamadas de las tres l�neas.
	 */
	public int darTotalNumeroLlamadas( )
	{
		int totalLlamadas = 0; // Inicializamos una variable donde acumulamos las llamadas
		LineaTelefonica[] var5;
		int var4 = (var5 = this.lineas).length;

		for(int var3 = 0; var3 < var4; ++var3) {
            LineaTelefonica linea = var5[var3];
            totalLlamadas += linea.darNumeroLlamadas(); // En cada iteraci�n obtenemos el n�mero de llamada de cada linea y se suma a la variable totalLlamadas
        }

		return totalLlamadas; // Retornamos el total de llamadas 
	}

	/**
	 * Retorna el total de minutos consumidos.
	 * @return Total de minutos de las tres l�neas.
	 */
	public int darTotalMinutos( )
	{
		int totalMinutos = 0; // Inicializamos una variable donde acumulamos los minutos
		LineaTelefonica[] var5;
		int var4 = (var5 = this.lineas).length;

		for(int var3 = 0; var3 < var4; ++var3) {
            LineaTelefonica linea = var5[var3];
            totalMinutos += linea.darNumeroMinutos(); // Mismo proceso del metodo anterior
        }

		return totalMinutos; // Retornamos el total de minutos
	}

	/**
	 * Retorna el costo total de las llamadas realizadas.
	 * @return Costo total de las tres l�neas.
	 */
	public double darTotalCostoLlamadas( )
	{      
		double costoTotal = 0.0; // Inicializamos una variable donde acumulamos el costo
		LineaTelefonica[] var6;
		int var5 = (var6 = this.lineas).length;

		for(int var4 = 0; var4 < var5; ++var4) {
            LineaTelefonica linea = var6[var4];
            costoTotal += linea.darCostoLlamadas(); // Mismo proceso del metodo anterior
        }

		return costoTotal; // Retornamos el costo total
	}

	/**
	 * Retorna el costo promedio de un minuto, seg�n los minutos consumidos. <br>
	 * @return Costo promedio por minuto.
	 */
	public double darCostoPromedioMinuto( )
	{
		
		int totalMinutos = this.darTotalMinutos();
		double costoTotal = this.darTotalCostoLlamadas();
		
		if (totalMinutos == 0) // Condicional para evitar dividir por 0
		{
			return 0.0;
		}
		
		return costoTotal / (double)totalMinutos; // Retornamos el promedio  
      
	}

	/**
     * Agrega una llamada local a la l�nea telef�nica 1 <br>
     * <b>post: </b> Se agreg� la llamada a la l�nea 1.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocal( int indiceLinea, int pMinutos )
    {
    	if (indiceLinea >= 0 && indiceLinea < this.lineas.length) {
            this.lineas[indiceLinea].agregarLlamadaLocal(pMinutos);
        }
        
    }

  
    /**
     * Agrega una llamada de larga distancia a una l�nea telef�nica espec�fica. <br>
     * @param pMinutos N�mero de minutos de la llamada. `pMinutos` > 0.
     */
    public void agregarLlamadaLargaDistancia( int indiceLinea, int pMinutos )
    {
        // Valida que el �ndice de la l�nea sea v�lido antes de intentar acceder a ella.
        if (indiceLinea >= 0 && indiceLinea < this.lineas.length) {
            this.lineas[indiceLinea].agregarLlamadaLargaDistancia(pMinutos);
        }

    }

    /**
     * Agrega una llamada a celular a la l�nea telef�nica 1. <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 1.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelular( int indiceLinea, int pMinutos )
    {
        // Valida que el �ndice de la l�nea sea v�lido antes de intentar acceder a ella.
        if (indiceLinea >= 0 && indiceLinea < this.lineas.length) {
            this.lineas[indiceLinea].agregarLlamadaCelular(pMinutos);
        }
    }

    /**
     * Reinicia todas las l�neas telef�nicas.
     * <b>post: </b> Se reinici� la llamada a la l�nea 1, 2 y 3.
     */
    public void reiniciar( )
    {
        this.lineas[0].reiniciar( );
        
        this.lineas[1].reiniciar();
        
        this.lineas[2].reiniciar();
    }

    //-----------------------------------------------------------------
    // Puntos de Extensi�n
    //-----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1.
     * @return Respuesta 1.
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * M�todo para la extensi�n 2.
     * @return Respuesta 2.
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}
