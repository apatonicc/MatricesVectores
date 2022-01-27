/**
 * Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y comprobar para
cada uno de los elementos del primer vector cuántas veces está en el segundo, es decir
primero: 3,7,2
segundo: 3,3,5
el resultado debe ser:
elemento 1 (3): 2 veces
elemento 2 (7): 0 veces
elemento 3 (2): 0 veces
 * @author alu
 *
 */
public class Ej4_Victores {

	public static void main(String[] args) {
		int[] vector1=new int[10];
		int[] vector2=new int[10];
		int contVeces = 0;
		int contContVeces =0;
		int contElementos=0;

		for(int i=0; i<vector1.length;++i) {
			int rand = (int)(Math.random()*5);
			vector1[i]=rand;
			System.out.print(" "+vector1[i]);
		}


		System.out.println(" ");
		for(int i=0; i<vector2.length;++i) {
			int rand = (int)(Math.random()*5);
			vector2[i]=rand;
			System.out.print(" "+vector2[i]);
		}
		
		for(int i=0; i<vector1.length;++i) {
			contVeces=0;
			contElementos++;
			
			for(int j=0; j<vector2.length;++j) {
				if(vector1[i]==vector2[j]) {
					contVeces++;
					contContVeces=contVeces;
				}
				
				
			}
			System.out.println("Elemento "+contElementos+"("+vector1[i]+")"+":"+" "+contContVeces+" veces");
		}


	}
}