package Chess.Board;

import Chess.Pieces.aPiece;

public abstract class aTile {

    int _tileCoordinate;

    aTile (int tileCoordinate) {

        _tileCoordinate = tileCoordinate;
    }

    public abstract boolean IsTileOccupied();

    public abstract aPiece GetPiece();
}
