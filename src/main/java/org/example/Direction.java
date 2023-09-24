package org.example;

public enum Direction {

    /**
     * <Enum 클래스 사용 이유>
     * 주로 고정된 상태나 타입을 표현할 때 사용
     * Enum 클래스의 인스턴스는 미리 정의된 상수 목록 중 하나로 제한
     */

    LEFT(-1),RIGHT(1),NONE(0);

    private final int value;

    Direction(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
