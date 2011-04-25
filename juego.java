//package cl.utfsm.inf.lp;
import cl.utfsm.inf.lp.claseEnte;
import cl.utfsm.inf.lp.clasePersonaje;
import cl.utfsm.inf.lp.claseObjeto;
import java.io.*;
import java.util.*;
//import cl.utfsm.inf.lp.*;


class juego {
	public static void main (String[] args) {
	//	int tamTab, cantPersonajes;
//		try{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese tamaño del tablero");
			int tamTab = sc.nextInt();

			System.out.println("Ingrese cantidad de personajes");
			int cantPersonajes = sc.nextInt();
			clasePersonaje piezas = new clasePersonaje() ;
			piezas.tableroInit(tamTab);
/*		}catch (IOException e){
			e.printStackTrace();
		}

		clasePersonaje.tableroInit(tamTab);	*/


	}

}
