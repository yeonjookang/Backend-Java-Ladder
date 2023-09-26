package org.example;

public enum ExceptionMessage {
    INVALID_RUN_POSITION("유효하지 않은 위치입니다"),
    INVALID_DRAW_POSITION_ROW("사다리를 그릴 수 없는 행 위치입니다"),
    INVALID_DRAW_POSITION_COLUMN("사다리를 그릴 수 없는 열 위치입니다"),
    INVALID_NATURAL_NUM("자연수이어야 합니다");

    private final String message;

    ExceptionMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
