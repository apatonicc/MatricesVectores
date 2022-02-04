
public class Main {

	public static void main(String[] args) {
		TresEnRaya tablero = new TresEnRaya();
		while(tablero.checkWin()!= true) {
			tablero.setPosPrim();
			tablero.setPosSeg();
		}
		
		
	}

}
