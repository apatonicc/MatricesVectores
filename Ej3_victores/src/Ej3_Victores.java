/**
 * Leer un vector de 10 componentes enteros; calcular el mayor, el menor y los lugares donde se
encuentran.
 * @author alu
 *
 */
public class Ej3_Victores {
	
	public static void main(String[] args) {
		int[] victor=new int[] {5,4,2,5,7,32,48,23,6,45};
		int j=0;
		int k=0;
		int posMax=0;
		int posMin=0;
		int valorMax = victor[0];
		int valorMin = victor[0];
		for(int i=0; i<10; ++i) {
			if (victor[i] > valorMax) {
				valorMax = victor[i];
			}
		}
		for(int i=0; i<10; ++i) {
			if (victor[i] < valorMin) {
				valorMin = victor[i];
			}
				
		}
		while (valorMax != victor[j]) {
			posMax++;
			j++;
		}
		while (valorMin != victor[k]) {
			posMin++;
			k++;
		}
		
		System.out.println(valorMin+" "+posMin);
		System.out.println(valorMax+" "+posMax);
		
	}
}
