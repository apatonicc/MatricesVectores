/**
 * Escribe un fragmento de c�digo que inicializa la matriz a blancos.
 * @author alu
 *
 */
public class Ejercicio_3 {

	public static void main(String[] args) {
		int TAMA�O = 100;
		char[][][][] cuenta = new char[TAMA�O][TAMA�O][TAMA�O][TAMA�O-1];
		
		for (int i=0; i < cuenta.length; ++i) {
			System.out.println(" ");
			for (int j=0; j < cuenta[i].length; ++j) {
				System.out.println(" ");
				for(int k=0; k < cuenta[i][j].length; ++k) {
					System.out.println(" ");
					for(int m=0; m < cuenta[i][j][k].length; ++m) {
						cuenta[i][j][k][m]=' ';
						System.out.print(" "+cuenta[i][j][k][m]);
					}
				}
			}
		}

	}

}
