package treenraya;
/**
 * Escribe una aplicación que juegue tres en raya. Representa el tablero como una matriz cuadrada
de 3 caracteres. La matriz se inicializa en espacios en blanco y a cada jugador se le pregunta en
qué posición quiere introducir su marca. La posición del primer jugador está marcada en el
tablero con una "O" y la posición del segundo jugador está marcada con una "X". Continuar el
proceso hasta que un jugador gana o el juego es un empate.
Para ganar, un jugador debe tener tres marcas en una fila, en una columna o en una diagonal.
Se produce un empate cuando el tablero está lleno y nadie ha ganado.
La posición de cada jugador debe ingresarse como índices: es decir, un número de fila, un
espacio y un número de columna. Haz la aplicación fácil de usar. Después de cada juego,
imprime un diagrama del tablero que muestre las posiciones finales.
Mantén una cuenta del número de juegos que cada jugador ha ganado. Antes del comienzo de
cada juego, pregunta a cada jugador si desea continuar. Si alguno de los jugadores desea
abandonar, imprime las estadísticas y acaba.
 * @author alu
 *
 */
import java.util.Scanner;
public class TresEnRaya {
	private int posPrim;
	private int posSeg;
	Scanner s = new Scanner(System.in);
	public TresEnRaya(){
		
	}
	public void setPosPrim(int posPrim) {
		System.out.println("Jugás con la X");
		System.out.println("Introduce la posiçao: ");
		posPrim=s.nextInt();
		while (!(posPrim<9 && posPrim>1)) {
			System.out.println("Bagá numarul: ");
			posPrim=s.nextInt();
		}
		this.posPrim = posPrim;
	}
	public void setPosSeg(int posSeg) {
		System.out.println("Jugás con la O");
		System.out.println("Introduce la posiçao: ");
		posSeg=s.nextInt();
		while (!(posSeg<9 && posSeg>1)) {
			System.out.println("Bagá numarul: ");
			posSeg=s.nextInt();
		}
		this.posSeg=posSeg;
	}

	public void jugar() {
		char [][] tablero = new char [3][3];
		for (int i = 0; i<tablero.length; i++) {
			for(int j=0; j<tablero[i].length;j++) {
				tablero[i][j]=' ';
			}
		}
		if (posPrim == 1) {
			tablero[0][0] = 'X';
			if (tablero[0][0] != ' ') {
				System.out.println("no.");
			}
		}
		
	}


}
