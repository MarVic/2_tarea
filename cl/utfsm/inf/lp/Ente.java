package cl.utfsm.inf.lp;
import java.util.*;
		/* Base generica de Objetos y Personajes en el tablero */
public interface Ente {
		/* Define el tipo del ente */
	public void setTipo(int tipo);
		/* Obtiene el tipo del ente */
	public int getTipo();
		/* Obtiene el nombre del tipo de ente, por ejemplo “Peón” */
	public String getNombreTipo();
		/* Obtiene el id */
	public int getId();
		/* Obtiene el id */
	public void setId(int idPass);
		/* Mueve a las coordenadas (x,y) */
	public boolean setPosicion(int x, int y);
		/* devuelve las coordenadas (x,y) donde está el personaje */
	public int[] getPosicion();
}

