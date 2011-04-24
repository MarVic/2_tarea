package cl.utfsm.inf.lp;
import java.util.*;
import cl.utfsm.inf.lp.Ente;


class claseEnte implements Ente {
 
	private static int tamTablero;
	private static int[][][] tablero = 
				 new int[tamTablero][tamTablero][2];

	protected int idTipo;//
	private int rut;
	private String nombreTipo; 
	private int[] cord = new int[2];


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


















