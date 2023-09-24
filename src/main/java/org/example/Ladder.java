package org.example;

public class Ladder {
    private Row[] rows;
    private int height;

    public Ladder(int personNum, int height) {
        this.rows = new Row[height+1];
        this.height=height;

        for(int i=0;i<rows.length;i++){
            rows[i]= new Row(personNum);
        }
    }

    public void drawLine(int x,int y){
        validationDrawLine(y);
        this.rows[y].setLine(x);
    }

    public int run(int num){
        num--;
        validationLadderPos(num);
        Position position=new Position(num);

        while(position.getY()!=rows[0].getPersonNum()){
            if(isRight(position)==1)
                position.setX(position.getX()+1);
            else if(isLeft(position)==1)
                position.setX(position.getX()-1);
            //한 칸 내려가기
            position.setY(position.getY()+1);
        }

        return position.getX()+1;
    }
    public int isRight(Position position){
        if(rows[position.getY()].getPoints()[position.getX()]==Direction.RIGHT.getValue())
            return 1;
        else
            return 0;
    }

    public int isLeft(Position position){
        if(rows[position.getY()].getPoints()[position.getX()]==Direction.LEFT.getValue())
            return 1;
        else
            return 0;
    }

    public void validationLadderPos(int num){
        if(num<0 || num>rows[0].getPersonNum()-1) {
            throw new RuntimeException("사다리 값 범위를 벗어났습니다.");
        }
    }

    public void validationDrawLine(int column){
        if(column<=0 || column>=height) {
            throw new RuntimeException("사다리 라인을 그릴 수 없는 범위입니다.");
        }
    }

    public Row[] getRows() {
        return rows;
    }
}
