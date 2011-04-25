package cl.utfsm.inf.lp;
import java.util.*;
import  cl.utfsm.inf.lp.Personaje;
import cl.utfsm.inf.lp.claseEnte;

public class clasePersonaje extends claseEnte implements Personaje {
	private boolean vivo;
	private boolean tomo_elixir;

	public clasePersonaje(){
		vivo = true;
		tomo_elixir = false;
	}
	
	public boolean  setPosicion(int x, int y){
		if(super.setPosicion(x,y) && (tablero[x][y][0] != null)){
			tablero[x][y][0] = this; 
			return true; 
		}else
			return false;
	}


	public void beber(Ente pocion){//modique obj por ente
		Objeto poss = (Objeto)pocion;
		if(!poss.fueTomado()){
			if(vivo = poss.tomar())
				tomo_elixir = true;
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
						sig_x = act_x + 4;
						tomo_elixir = false;
					}	
					else
						 sig_x = act_x + 3;
					sig_y = act_y + 1;
					if(setPosicion(sig_x, sig_y)){
						tablero[act_x][act_y][0] = null;
					}else
						return cord;	
					break;	

				case 3: //alfil
					if(tomo_elixir){
						sig_x = act_x + 2;
						tomo_elixir = false;
					}	
					else
						 sig_x = act_x + 1;
					sig_y = act_y + 1;
					if(setPosicion(sig_x, sig_y)){
						tablero[act_x][act_y][0] = null;
					}else
						return cord;	
					break;	
				
				case 4://peon				
					if(tomo_elixir){
						sig_x = act_x + 2;
						tomo_elixir = false;
					}	
					else
						 sig_x = act_x + 1;
					sig_y = act_y ;
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


