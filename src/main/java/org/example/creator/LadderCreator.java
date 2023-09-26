package org.example.creator;

import org.example.ExceptionMessage;
import org.example.NaturalNumber;
import org.example.Position;
import org.example.Row;

public class LadderCreator {
    private Row[] rows;
    private int height;

    public LadderCreator(NaturalNumber personNum, NaturalNumber height) {
        this.rows = new Row[height.getNumber()+1];
        this.height=height.getNumber();

        for(int i=0;i<rows.length;i++){
            rows[i]= new Row(personNum);
        }
    }

    public void drawLine(Position x, Position y){
        validationPositionY(y);
        rows[y.getPosition()].setLine(x);
    }


    public void validationPositionY(Position y){
        if(y.isSmallerThan(0) || y.isBiggerThan(height)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_DRAW_POSITION_ROW.getMessage());
        }
    }


    public Row[] getRows() {
        return rows;
    }
}
