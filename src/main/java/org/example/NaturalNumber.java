package org.example;

public class NaturalNumber {
    private final int number;


    public NaturalNumber(int number) {
        validate(number);
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public static NaturalNumber of(int number){
        //객체 재사용성 높임
        return new NaturalNumber(number);
    }

    private void validate(int number){
        if (!isNaturalNumber(number)){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_NATURAL_NUM.getMessage());
        }
    }

    private boolean isNaturalNumber(int number) {
        return number >=1;
    }
}
