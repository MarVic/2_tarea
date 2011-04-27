package cl.utfsm.inf.lp;
import java.util.*;
import  cl.utfsm.inf.lp.Personaje;
import cl.utfsm.inf.lp.claseEnte;

public class clasePersonaje extends claseEnte implements Personaje {
	static private int numeroMuertos = 0;
	static private int nPosFinal = 0;
	private boolean posFinal;
	private boolean vivo;
	private boolean tomo_elixir;

	//para funcion setPosicion
	private int aux_x, aux_y; 
	
	public clasePersonaje(){
		vivo = true;
		tomo_elixir = false;
		posFinal = false;
	}

	static public int numMuertos(){
		return numeroMuertos;
	}

	public boolean esPosFinal(){
		return posFinal;
	}

	static public int nPerPosFinal(){
		return nPosFinal;
	}
	
	public boolean  setPosicion(int x, int y){
		/*setea posicion y maneja logica de 
		 posiciones	finales*/
		aux_x = cord[0];
		aux_y = cord[1];
		if(super.setPosicion(x, y)){
			if(tablero[x][y][0] == null){
				tablero[x][y][0] = this;	
				return true;
			}else if( ((clasePersonaje)(tablero[x][y][0])).esPosFinal()){
				cord[0] = aux_x;
				cord[1] = aux_y;
				posFinal = true;
				nPosFinal++;
				return false;
			}
			else {
				cord[0] = aux_x;
				cord[1] = aux_y;
				return false;
		 	}
		}else{
			posFinal = true;
			nPosFinal++;
			return false;
		}

	}


	public void beber(Ente pocion){//modique obj por ente
		Objeto poss = (Objeto)pocion;
		if(!poss.fueTomado()){
			if(vivo = poss.tomar())
				tomo_elixir = true;
			else
				numeroMuertos++;
		}
	}

	public boolean signosVitales(){
		return vivo;
	}

	public int[] mover() {
		int sig_x, sig_y, act_x, act_y;

		if(!signosVitales())
			return cord;

		if(tablero[cord[0]][cord[1]][1] != null)
			this.beber(tablero[cord[0]][cord[1]][1]);
		
		if(this.signosVitales()){
			act_x = cord[0];
			act_y = cord[1];

			switch (idTipo){
				case 2://caballo
					if(tomo_elixir){
						sig_y = act_y + 4;
						tomo_elixir = false;
					}	
					else
						 sig_y = act_y + 3;
					sig_x = act_x + 1;
					if(setPosicion(sig_x, sig_y)){
						tablero[act_x][act_y][0] = null;
					}else
						return cord;	
					break;	

				case 3: //alfil
					if(tomo_elixir){
						sig_y = act_y + 2;
						tomo_elixir = false;
					}	
					else
						 sig_y = act_y + 1;
					sig_x = act_x + 1;
					if(setPosicion(sig_x, sig_y)){
						tablero[act_x][act_y][0] = null;
					}else
						return cord;	
					break;	
				
				case 4://peon				
					if(tomo_elixir){
						sig_y = act_y + 2;
						tomo_elixir = false;
					}	
					else
						 sig_y = act_y + 1;
					sig_x = act_x ;
					if(setPosicion(sig_x, sig_y)){
						tablero[act_x][act_y][0] = null;
					}else
						return cord;	
					break;	
																										 						
			} 

		}
		return cord;
	}

}


