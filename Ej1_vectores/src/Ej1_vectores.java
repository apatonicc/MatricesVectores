/**
 * Se generan 20 n�meros aleatorios de tipo entero y se almacenan en un vector. Hay que calcular
y mostrar la media y, adem�s, mostrar cu�ntos n�meros hay:
Superiores a la media
Inferiores a la media
Iguales a la media
 * @author alu
 *
 */
public class Ej1_vectores {

	public static void main(String[] args) {
		int media=0;
		int menorMedia=0;
		int mayorMedia=0;
		int igualMedia=0;
		int [] vector = new int [10];
		for (int i = 0; i < vector.length; ++i) {
			int num=(int) (Math.random()*100);
			media += num;
			vector[i]=num;
			System.out.println(vector[i]);
		}
		media = media/10;
		
		for (int i = 0; i < vector.length; ++i) {
			if(vector[i]>media)
				mayorMedia++;
			if(vector[i]<media)
				menorMedia++;
			if(vector[i]==media)
				igualMedia++;
				
		}
		System.out.println("La media es: "+media);
		System.out.println(menorMedia);
		System.out.println(mayorMedia);
		System.out.println(igualMedia);
		

	}

}
