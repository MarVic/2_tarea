package cl.utfsm.inf.lp;
import cl.utfsm.inf.lp.Objeto;
import cl.utfsm.inf.lp.claseEnte;
import java.util.*;

class claseObjeto extends claseEnte implements Objeto {
	private boolean tomado;
		
	claseObjeto(){
		tomado = false;
	}
	public void setEfecto(boolean tipo){
		if(tipo == true)
			setTipo(1);
		else
			setTipo(0);
	}

	public boolean tomar(){
		tomado = true;
		if( idTipo == 0 )
			return false;
		else
			return true;
	}
	public boolean fueTomado(){
		return tomado;
	}

	public boolean setPosicion(int x, int y){
		if(super.setPosicion(x,y)){
			tablero[x][y][1] = this; 
			return true;
		}else
			return false; 
	}

}
