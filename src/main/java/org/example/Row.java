package org.example;

import lombok.Getter;

public class Row {
    private Node[] points;
    private int personNum;

    public Row(NaturalNumber personNum) {
        this.personNum=personNum.getNumber();
        this.points = new Node[personNum.getNumber()];
        for (int i=0;i<personNum.getNumber();i++){
            points[i]=Node.of(Direction.NONE);
        }
    }

    public void setLine(Position startPosition){
        validationRowPos(startPosition);
        setDirectionAtPosition(startPosition,Direction.RIGHT);
        setDirectionAtPosition(startPosition.next(),Direction.LEFT);
    }

    public void setDirectionAtPosition(Position startPosition,Direction direction){
        points[startPosition.getPosition()]=Node.of(direction);
    }

    public void validationRowPos(Position pos){
        if(pos.isSameWith(personNum-1) || pos.isBiggerThan(personNum-1)|| pos.isSmallerThan(0)){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_DRAW_POSITION_COLUMN.getMessage());
        }
    }

    public void validatePosition(Position pos){
        if(pos.isBiggerThan(personNum-1)|| pos.isSmallerThan(0)){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_POSITION.getMessage());
        }
    }

    public Position nextPosition(Position currentPosition){
        validatePosition(currentPosition);
        return points[currentPosition.getPosition()].move(currentPosition);
    }



    public Node[] getPoints() {
        return points;
    }

    public int getPersonNum(){
        return personNum;
    }
}
