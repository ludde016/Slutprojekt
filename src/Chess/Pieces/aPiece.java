package Chess.Pieces;

public abstract class aPiece {

    protected int cord_x, cord_y;
    // protected boolean PieceColor;

    public void Piece(int x, int y, boolean color) {
        cord_x = x;
        cord_y = y;
       // PieceColor = color;

    }

    public abstract int[][] MovePiece(int start_x, int start_y);
}
