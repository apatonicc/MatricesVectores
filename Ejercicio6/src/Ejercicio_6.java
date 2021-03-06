/**
 * Dadas las declaraciones
final int NUM_DPTOS = 100;
final int NUM_TIENDAS = 10;
final int NUM_MESES = 12;
a) Declara una matriz ventas de valores en doble precisi?n, indexada por el n?mero de
departamentos, tiendas y meses.
b) Crea una instancia de la matriz ventas.
c) ?Cu?l es el valor de los componentes de la matriz reci?n creada?
12000
d) Escribe un fragmento de c?digo que calcule la suma de las ventas de enero.
e) Escribe un fragmento de c?digo que calcule la suma de las ventas de la tienda 2.
f) Escribe un fragmento de c?digo que calcule la suma de las ventas del departamento 33.
 * @author alu
 *
 */
class Ejercicio_6 {

	public static void main(String[] args) {
		final int NUM_DPTOS = 100;
		final int NUM_TIENDAS = 10;
		final int NUM_MESES = 12;
		
		int[][][] ventas = new int[NUM_DPTOS][NUM_TIENDAS][NUM_MESES];
		ventas[1][1][1] = 5;
		ventas[2][2][1] = 5;
		ventas[4][2][2] = 5;
		
		System.out.println(getSalesByMonth(ventas,1));
		System.out.println(getSalesByShop(ventas,2));
		System.out.println(getSalesByDpt(ventas,2));
	}
	public static int getSalesByMonth(int[][][] datos,int mes) {
		int ventasMes = datos[0][0][mes];
		for(int i = 0; i < 100; ++i) {
			for(int j = 0; j < 10; ++j) {
				if (datos[i][j][mes] > 0)
					ventasMes += datos[i][j][mes];
			}
		}
		return ventasMes;
	}
	//
	public static int getSalesByShop(int[][][] datos,int tienda) {
		int ventasTienda = 0;
		for(int i = 0; i < 100; ++i) {
			//for(int j = 0; j < 10; ++j) {
				for(int k = 0; k < 12; ++k) {
					if (datos[i][tienda][k] > 0)
						ventasTienda += datos[i][tienda][k];
				}
		}
		return ventasTienda;
	}
	
	public static int getSalesByDpt(int [][][] datos, int dpt) {
		int ventasDpt = 0;
		//for(int i = 0;  ; ++i) {
			for(int j = 0; j < 10; ++j) {
				for(int k = 0; k < 12; ++k) {
					if (datos[dpt][j][k] > 0)
						ventasDpt += datos[dpt][j][k];
				}
			}
		return ventasDpt;
	}
	
}

