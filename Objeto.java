package cl.utfsm.inf.lp;
import cl.utfsm.inf.lp.Ente;
import java.util.*;

/* Base generica de Objetos */
public interface Objeto extends Ente {
	        /* Define el efecto al tomar la poción */
        public void setEfecto(boolean tipo);
	        /* Devuelve el efecto al tomar la poción */
        public boolean tomar();
		
			public boolean fueTomado();
}

