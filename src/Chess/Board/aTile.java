package Chess.Board;

import Chess.Pieces.aPiece;

public abstract class aTile {

    int tileCoordinate;

    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean IsTileOccupied();

    public abstract aPiece GetPiece();
}
