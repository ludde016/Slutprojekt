package Chess.Board;

import Chess.Pieces.aPiece;

public class OccupiedTile extends aTile{
    OccupiedTile(int coordinate) {
        super(cordinate);
    }

    public boolean IsTileOccupied() {

        return true;
    }

    public aPiece GetPiece() {

    }
}
