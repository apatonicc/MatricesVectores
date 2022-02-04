import java.util.Scanner;

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
 * @author Apatonic
 *
 */
public class TresEnRaya {
	private int posPrim;
	private int posSeg;
	private char [][] tablero = new char[3][3];
	Scanner s = new Scanner(System.in);
	public TresEnRaya() {	
		for(int i=0;i<tablero.length;++i) {
			//System.out.println(" ");
			for(int j=0;j<tablero[i].length;++j) {
				tablero[i][j]=' ';
				//System.out.print(tablero[i][j]);
			}
		}
		
	}
	

	public void setPosPrim() {
		System.out.println("Juegas con O");
		System.out.println("Introduce posicion donde quieres poner la O: ");
		this.posPrim=s.nextInt();
		if(posPrim==1 && tablero[0][0]==' ') {
			tablero[0][0]='O';
		}else if(posPrim==2 && tablero[0][1]== ' ') {
			tablero[0][1]='O';
		}else if(posPrim==3 && tablero[0][2]== ' ') {
			tablero[0][2]='O';
		}else if(posPrim==4 && tablero[1][0]== ' ') {
			tablero[1][0]='O';
		}else if(posPrim==5 && tablero[1][1]== ' ') {
			tablero[1][1]='O';
		}else if(posPrim==6 && tablero[1][2]== ' ') {
			tablero[1][2]='O';
		}else if(posPrim==7 && tablero[2][0]== ' ') {
			tablero[2][0]='O';
		}else if(posPrim==8 && tablero[2][1]== ' ') {
			tablero[2][1]='O';
		}else if(posPrim==9 && tablero[2][2]== ' ') {
			tablero[2][2]='O';
		}else {
			System.out.println("Error 404 :'(");
		}
		this.posPrim=0;
		getTablero();
		checkWin();
	}
	public void setPosSeg() {
		System.out.println("Juegas con X");
		System.out.println("Introduce posicion donde quieres poner la X: ");
		this.posSeg=s.nextInt();
		if(posSeg==1 && tablero[0][0]==' ') {
			tablero[0][0]='X';
		}else if(posSeg==2 && tablero[0][1]== ' ') {
			tablero[0][1]='X';
		}else if(posSeg==3 && tablero[0][2]== ' ') {
			tablero[0][2]='X';
		}else if(posSeg==4 && tablero[1][0]== ' ') {
			tablero[1][0]='X';
		}else if(posSeg==5 && tablero[1][1]== ' ') {
			tablero[1][1]='X';
		}else if(posSeg==6 && tablero[1][2]== ' ') {
			tablero[1][2]='X';
		}else if(posSeg==7 && tablero[2][0]== ' ') {
			tablero[2][0]='X';
		}else if(posSeg==8 && tablero[2][1]== ' ') {
			tablero[2][1]='X';
		}else if(posSeg==9 && tablero[2][2]== ' ') {
			tablero[2][2]='X';
		}else {
			System.out.println("Error 404 :'(");
		}
		
		getTablero();
		checkWin();
	}

	public void getTablero() {
		for(int i =0; i<tablero.length; ++i) {
			System.out.println();
			for(int j=0; j<tablero[i].length;++j) {
				System.out.print(this.tablero[i][j]+"|");
			}
		}
	}
	public boolean checkWin() {
		boolean terminador=false;
		boolean win=false;
		while (terminador != true) {
			//Win horizontales
			if(tablero[0][0]=='X' && tablero[0][1]=='X'&&tablero[0][2]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][0]=='O' && tablero[0][1]=='O'&&tablero[0][2]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[1][0]=='X' && tablero[1][1]=='X'&&tablero[1][2]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[1][0]=='O' && tablero[1][1]=='O'&&tablero[1][2]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[2][0]=='X' && tablero[2][1]=='X'&&tablero[2][2]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[2][0]=='O' && tablero[2][1]=='O'&&tablero[2][2]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}
			
			//Win Verticales
			else if(tablero[0][0]=='X' && tablero[1][0]=='X'&&tablero[2][0]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][0]=='O' && tablero[1][0]=='O'&&tablero[2][0]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][1]=='X' && tablero[1][1]=='X'&&tablero[2][1]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][1]=='O' && tablero[1][1]=='O'&&tablero[2][1]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][2]=='X' && tablero[1][2]=='X'&&tablero[2][2]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][2]=='O' && tablero[1][2]=='O'&&tablero[2][2]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}
			
			//Win diagonales
			else if(tablero[0][0]=='X' && tablero[1][1]=='X' && tablero[2][2]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][0]=='O' && tablero[1][1]=='O' && tablero[2][2]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][2]=='O' && tablero[1][1]=='O' && tablero[2][0]=='O') {
				System.out.println("O ha ganado");
				terminador = true;
				win=true;
			}else if(tablero[0][2]=='X' && tablero[1][1]=='X' && tablero[2][0]=='X') {
				System.out.println("X ha ganado");
				terminador = true;
				win=true;
			}
			else {terminador=true;}
		}
		return win;
		
	}

	

	
}
