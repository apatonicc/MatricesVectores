/**
 * Usando la matriz anterior, realiza las siguientes cuestiones:
a) Asigna 27.3 al componente de la fila 13 y la comuna 7
b) �Sobre qu� rango de valores deber� iterar un bucle for exterior para sumar los valores
de cada fila?
	
c) �Sobre qu� rango de valores deber� iterar un bucle for exterior para sumar los valores
de cada columna?
d) Escribe un fragmento de c�digo para inicializar los elementos de la matriz a 1.

e) Escribe un fragmento de c�digo que imprima los contenidos de la matriz, una fila por
cada l�nea de salida.
 * @author alu
 *
 */
public class Ejercicio_2 {

	public static void main(String[] args) {
		float [][] plan = new float [30][10];
		
		//plan[13][7]= (float) 27.3;
		for (int i = 0; i < plan.length; ++i) {
			System.out.println(" ");
		      for(int j = 0; j < plan[i].length; ++j) {
		    	  plan[i][j]=1;
		    	  System.out.print(" "+plan[i][j]);
		    	  
		      }
		    }
		}

	}

