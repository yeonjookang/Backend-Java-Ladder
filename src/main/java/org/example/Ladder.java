package org.example;

public class Ladder {
    private Row[] rows;
    private int height;

    public Ladder(NaturalNumber personNum, NaturalNumber height) {
        this.rows = new Row[height.getNumber()+1];
        this.height=height.getNumber();

        for(int i=0;i<rows.length;i++){
            rows[i]= new Row(personNum);
        }
    }

    public void drawLine(Position x,Position y){
        validationPositionY(y);
        rows[y.getPosition()].setLine(x);
    }

    public int run(Position position){
        position=position.prev();
        validationStartPosition(position);

        for(int i=0;i<rows.length;i++){
            position=rows[i].nextPosition(position);
        }

        return position.getPosition()+1;
    }

    public void validationStartPosition(Position startPosition){
        if(!Position.isPosition(startPosition.getPosition())
                || startPosition.getPosition()>rows[0].getPersonNum()-1) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_POSITION.getMessage());
        }
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
