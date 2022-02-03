package treenraya;
/**
 * Escribe una aplicaci�n que juegue tres en raya. Representa el tablero como una matriz cuadrada
de 3 caracteres. La matriz se inicializa en espacios en blanco y a cada jugador se le pregunta en
qu� posici�n quiere introducir su marca. La posici�n del primer jugador est� marcada en el
tablero con una "O" y la posici�n del segundo jugador est� marcada con una "X". Continuar el
proceso hasta que un jugador gana o el juego es un empate.
Para ganar, un jugador debe tener tres marcas en una fila, en una columna o en una diagonal.
Se produce un empate cuando el tablero est� lleno y nadie ha ganado.
La posici�n de cada jugador debe ingresarse como �ndices: es decir, un n�mero de fila, un
espacio y un n�mero de columna. Haz la aplicaci�n f�cil de usar. Despu�s de cada juego,
imprime un diagrama del tablero que muestre las posiciones finales.
Mant�n una cuenta del n�mero de juegos que cada jugador ha ganado. Antes del comienzo de
cada juego, pregunta a cada jugador si desea continuar. Si alguno de los jugadores desea
abandonar, imprime las estad�sticas y acaba.
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
		System.out.println("Jug�s con la X");
		System.out.println("Introduce la posi�ao: ");
		posPrim=s.nextInt();
		while (!(posPrim<9 && posPrim>1)) {
			System.out.println("Bag� numarul: ");
			posPrim=s.nextInt();
		}
		this.posPrim = posPrim;
	}
	public void setPosSeg(int posSeg) {
		System.out.println("Jug�s con la O");
		System.out.println("Introduce la posi�ao: ");
		posSeg=s.nextInt();
		while (!(posSeg<9 && posSeg>1)) {
			System.out.println("Bag� numarul: ");
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
