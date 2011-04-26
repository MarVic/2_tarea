package cl.utfsm.inf.lp;
//import cl.utfsm.inf.lp.Objeto;
import java.util.*;
	/* Base genérica de Personajes */
public interface Personaje extends Ente {
			/* Mueve el personaje y devuelve la posición final en un int[2] */
        public int[] mover();
			/* interactua con el objeto poción */
        public void beber(Ente pocion);
}

