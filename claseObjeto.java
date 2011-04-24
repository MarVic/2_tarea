package cl.utfsm.inf.lp;
import cl.utfsm.inf.lp.Objeto;
import cl.utfsm.inf.lp.claseEnte;
import java.util.*;

class claseObjeto extends claseEnte implements Objeto {

	public void setEfecto(boolean tipo){
		if(tipo == true)
			setTipo(1);
		else
			setTipo(0);
	}

	public boolean tomar (){
		if( idTipo == 0 )
			return false;
		else
			return true;
	}


}
