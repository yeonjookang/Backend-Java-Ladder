package org.example;

import lombok.Getter;

public class Row {
    private int[] points;
    private int personNum;

    public Row(NaturalNumber personNum) {
        this.personNum=personNum.getNumber();
        this.points = new int[personNum.getNumber()];
    }

    public void setLine(int startPosition){
        validationRowPos(startPosition);
        points[startPosition]=Direction.RIGHT.getValue();
        points[startPosition+1]=Direction.LEFT.getValue();
    }

    public void validationRowPos(int pos){
        if(pos==personNum-1 || pos>personNum-1 || pos<0){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_DRAW_POSITION_COLUMN.getMessage());
        }
    }

    public int[] getPoints() {
        return points;
    }

    public int getPersonNum(){
        return personNum;
    }
}
