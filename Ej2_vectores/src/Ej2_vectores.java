/**
 * Leer dos vectores de dimensión 10 para construir un tercer vector cuyos componentes sean la
suma de los dos anteriores e imprimirlo
 * @author alu
 *
 */
public class Ej2_vectores {

	public static void main(String[] args) {
		int[] victor1= new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] victor2= new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] victor3= new int[10];
		for(int i=0; i<10; ++i) {
			victor3[i]=victor1[i]+victor2[i];
			System.out.println(victor3[i]);
		}
		
		

	}

}
