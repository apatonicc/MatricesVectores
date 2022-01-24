/**
 * Escribe un fragmento de c�digo que encuentre el valor mayor en una matriz de n�meros en
doble precisi�n de 50 filas por 50 columnas.
 * @author alu
 *
 */
class Ejercicio_5 {
	public static void main(String[] args) {
		double [][] datos = new double[50][50];
		datos[10][10]=10;
		datos[14][23]=142;
		System.out.println(getMax(datos));
		

	}
	public static double getMax(double [][] numeros) {
		double valorMaximo = numeros[0][0];
		for(int i = 0; i < numeros.length; ++i) {
			for(int j = 0; j < numeros[i].length; ++j) {
				if (numeros[i][j] > valorMaximo)
					valorMaximo = numeros[i][j];
			}
		}
		return valorMaximo;
	}

}
