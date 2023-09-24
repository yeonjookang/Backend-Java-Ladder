package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ladder {
    private Row[] rows;
    private int personNum;

    public Ladder(int person, int height) {
        this.rows = new Row[person];
        this.personNum=person;

        for(int i=0;i<rows.length;i++){
            rows[i]= new Row(height);
        }
    }

    public void drawLine(int x,int y){
        validationDrawLine(x);

        this.rows[x].setLine(y);
        this.rows[x+1].setLine(y);
    }

    public int run(int num){
        num--;
        validationLadderPos(num);
        Position position=new Position(num);

        while(position.getY()!=rows[0].getHeight()){

            if(checkPoint(position.getX(),position.getY())==1){
                if(position.getX()==0){
                    //오른쪽 라인만 체크
                    if(checkPoint(position.getX()+1, position.getY())==1){
                        position.setX(position.getX()+1);
                    }
                } else if (position.getX()==rows.length-1) {
                    //왼쪽 라인만 체크
                    if(checkPoint(position.getX()-1, position.getY())==1){
                        position.setX(position.getX()-1);
                    }
                } else{
                    //양쪽 라인 다 체크
                    if(checkPoint(position.getX()+1, position.getY())==1){
                        position.setX(position.getX()+1);
                    }else if(checkPoint(position.getX()-1, position.getY())==1){
                        position.setX(position.getX()-1);
                    }
                }
            }

            //한 칸 내려가기
            position.setY(position.getY()+1);

        }

        return position.getX()+1;
    }

    public int checkPoint(int x,int y){
        return rows[x].getPoints()[y];
    }

    public void validationLadderPos(int num){
        if(num<0 || num>personNum-1) {
            throw new RuntimeException("사다리 값 범위를 벗어났습니다.");
        }
    }

    public void validationDrawLine(int num){
        if(num<0 || num>personNum-2) {
            throw new RuntimeException("사다리 라인을 그릴 수 없는 범위입니다.");
        }
    }

    public Row[] getRows() {
        return rows;
    }
}
