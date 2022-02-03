/**
 * Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tama�o fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es �nico: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (m�todos de la clase) son las siguientes:
- vaciar: vac�a el conjunto.
- agregar: a�ade un entero al conjunto
- eliminar: retira un entero del conjunto (habr� que desplazar elementos).
- copiar: recopila un conjunto en otro
- esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
existe.
- posicion: reenv�a la posici�n en el conjunto de un entero dado, o el valor -1 si no existe.
- esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta que dos
conjuntos son iguales si tienen los mismos elementos y en el mismo orden
- imprimir: realiza la visualizaci�n del conjunto.

 * @author alu
 *
 */
public class Conjunto {
	private int numero=0;
	private int rand;
	private boolean terminador = false;
	private int count = 0;
	public Conjunto() {
		int [] tabla = new int [100];
		for(int i = 0; i < tabla.length;++i) {
			terminador=false;
			while(terminador == false) {
				
				if(tabla[count]==rand) {
					rand = (int)(Math.random()*100);
				}else {
					terminador = true;
				}
				count++;
			}
			tabla[i]=rand;
		
		System.out.print(tabla[i]+" ");
		}	
	}
}
