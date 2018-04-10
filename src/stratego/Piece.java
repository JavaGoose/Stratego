package stratego;

import stratego.FightResult;

/*
 * Let 100 = Bomb
 * and 0 = Flag
 */

public class Piece {

    public Piece(int number) {
        this.number = number;
    }

    public FightResult attack(Piece other) {
        if (this.getNumber() == 1)
            return FightResult.WIN;
        else if (this.getNumber() > other.getNumber())
            return FightResult.WIN;
        else if (this.getNumber() == other.getNumber())
            return FightResult.TIE;
        else
            return FightResult.LOSE;
    }

    public int getNumber() {
        return number;
    }

    private int number;

}
