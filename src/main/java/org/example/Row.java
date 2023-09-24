package org.example;

import lombok.Getter;

@Getter
public class Row {
    private int[] points;
    private int height;

    public Row(int height) {
        this.height=height;
        this.points = new int[height+1];
    }

    public void setLine(int pos){
        validationRowPos(pos);

        this.points[pos]=1;
    }

    public void validationRowPos(int pos){
        if(pos==0 || pos==height){
            throw new RuntimeException("pos 값이 0 또는 배열의 마지막 인덱스입니다.");
        } else if (pos>height) {
            throw new RuntimeException("pos 값이 배열 인덱스 범위 초과입니다.");
        }
    }


    public void printPoints(){
        for(int i=0;i< height;i++){
            System.out.print(points[i]);
            System.out.print(' ');
        }
    }

    public int[] getPoints() {
        return points;
    }

    public int getHeight(){
        return height;
    }
}
