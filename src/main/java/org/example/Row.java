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
        if(pos==personNum-1){
            throw new RuntimeException("pos 값이 0 배열의 마지막 인덱스입니다.");
        } else if (pos>personNum-1 || pos<0) {
            throw new RuntimeException("pos 값이 배열 인덱스 범위 초과입니다.");
        }
    }

    public void printPoints(){
        for(int i=0;i<personNum;i++){
            System.out.print(points[i]);
            System.out.print(' ');
        }
    }

    public int[] getPoints() {
        return points;
    }

    public int getPersonNum(){
        return personNum;
    }
}
