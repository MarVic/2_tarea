//package cl.utfsm.inf.lp;
//import cl.utfsm.inf.lp.*;

import cl.utfsm.inf.lp.claseEnte;
import cl.utfsm.inf.lp.clasePersonaje;
import cl.utfsm.inf.lp.claseObjeto;
import java.io.*;
import java.util.*;


class juego {
	public static void main (String[] args) {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Ingrese tamaño del tablero");
			int tamTab = sc.nextInt();
			claseEnte.tableroInit(tamTab);

			System.out.println("Ingrese cantidad de personajes");
			int cantPers = sc.nextInt();
			clasePersonaje[] personajes = new clasePersonaje[cantPers];

			int tip, x, y;
			for(int i = 0; i < cantPers; i++){
				personajes[i] = new clasePersonaje();
				personajes[i].setId(i);
				System.out.println("Personaje : " + i + " ingrese Tipo de personaje " );
				tip = sc.nextInt();
				personajes[i].setTipo(tip);
				System.out.println("ingrese cordenadas del personaje (x y)");
				x = sc.nextInt();
				y =  sc.nextInt();
				personajes[i].setPosicion(x, y);
			}
			
			System.out.println("Ingrese cantidad de Objetos");
			int cantObj = sc.nextInt();
			claseObjeto[] objetos = new claseObjeto[cantObj];

			for(int i = 0; i < cantObj; i++){
				objetos[i] = new claseObjeto();				
				objetos[i].setId(i);
				System.out.println("Objeto : " + i + " ingrese Tipo de Objeto " );
				tip = sc.nextInt();
				objetos[i].setTipo(tip);
				System.out.println("ingrese cordenadas del Objeto (x y)");
				x = sc.nextInt();
				y = sc.nextInt();
				objetos[i].setPosicion(x, y);
			  
			}

			int tiempo = 0;
			System.out.println("Tiempo : " +tiempo);
			System.out.println("Personajes");
			for(int i = 0; i < cantPers; i++){
				int [] cord_p = personajes[i].getPosicion();
				System.out.println( personajes[i].getNombreTipo()+" id : "+personajes[i].getId()+ "  Posicion : " + cord_p[0] + " " + cord_p[1] );
			}
			for(int i = 0; i < cantObj; i++){
				int[] cord_o = objetos[i].getPosicion(); 
				System.out.println(objetos[i].getNombreTipo()+" id : "+objetos[i].getId() + " Posicion : "+ cord_o[0]+ " " +cord_o[1]);
			}
			while( (clasePersonaje.numMuertos() < cantPers) && (clasePersonaje.nPerPosFinal() < cantPers )){
				System.out.println("Tiempo : " +  ++tiempo);
				for(int i = 0; i < cantPers; i++)
					personajes[i].mover();

				System.out.println("Personajes");
				for(int i = 0; i < cantPers; i++){
					int [] cord_p = personajes[i].getPosicion();
					if(personajes[i].signosVitales())
						System.out.println( personajes[i].getNombreTipo()+" id : "+personajes[i].getId()+ "  Posicion : " + cord_p[0] + " " + cord_p[1] );
					else
						System.out.println( personajes[i].getNombreTipo()+" id : "+personajes[i].getId()+ "  Posicion :  Muerto");
				}
				System.out.println("Objetos");
				for(int i = 0; i < cantObj; i++){
					int[] cord_o = objetos[i].getPosicion(); 
					if(objetos[i].fueTomado())
						System.out.println(objetos[i].getNombreTipo()+" id : "+objetos[i].getId() + " Posicion : Tomada");
					else
						System.out.println(objetos[i].getNombreTipo()+" id : "+objetos[i].getId() + " Posicion : "+ cord_o[0]+ " " +cord_o[1]);
			}

		}	

	}

}
