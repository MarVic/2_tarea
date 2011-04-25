package cl.utfsm.inf.lp;
import java.util.*;
import cl.utfsm.inf.lp.Ente;


public class claseEnte implements Ente {
 
	protected static int tamTablero;
	protected static Ente[][][] tablero = 
				 new Ente[tamTablero][tamTablero][2];

	protected int idTipo;//
	private int rut;
	private String nombreTipo; 
	protected int[] cord = new int[2];
	
	static public void tableroInit(int tam){
		tamTablero = tam;
		for(int k = 0; k < 2; k++)
			for(int i = 0; i < tamTablero; i++ )
				for(int j = 0; j < tamTablero; j++)
						tablero[i][j][k] = null;
  	}


	public void setTipo(int tipo){
		idTipo = tipo;
		switch (tipo){
			case 0 :
				nombreTipo = "Venemo";
				break;
			case 1 :
				nombreTipo = "Elixir";
				break;
			case 2 :
				nombreTipo = "Caballo";
				break; 
			case 3 :
				nombreTipo = "Alfil";
				break;
			case 4 : 
				nombreTipo = "Peon";
				break;
		}

	}

	public int getTipo(){
		return idTipo;
	}

	public String getNombreTipo(){
		return nombreTipo;
	}

	public int getId(){
		return rut;
	}

	public void setId(int idPass){
		rut = idPass;
	}
	
	public boolean setPosicion(int x, int y){
		if ( (x < tamTablero) && (x >= 0 ) &&
				(y < tamTablero) && (y >= 0 )){ 
				cord[0] = x;
				cord[1] = y;		
				return true;
			}
			else
				return false;
		
	}
	

	public int[] getPosicion(){
		return cord;
	}



}		


















