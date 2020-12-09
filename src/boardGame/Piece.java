package boardGame;

public abstract class Piece {
	
	protected Position position;
	private  Board board;
	public Piece(Board board) {
	
		this.board = board;
		
	}
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean [][] possibleMoves(); //matriz com True ou Falso relatando um conjunto de posi��es
	
	
	public boolean possibleMove(Position position)   //metodo q vai retornar se UMA posi��o � True ou False
	{
		return possibleMoves()[position.getRow()][position.getColumn()];  
		
//metodo "hook", um metodo que vai chamar uma possivel implementa��o de um metodo concreto de uma subclasse concreta de Piece.

	}
	
	public boolean isThereAnyPossibleMove() {
		
		boolean [][] mat = 	possibleMoves();
		for (int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat [i][j]) {
					return true;
				} 
			}
		}  
		return false;
	}
	
}
