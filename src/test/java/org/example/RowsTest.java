package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RowsTest {

    Row row = new Row(NaturalNumber.of(3));

    @Test
    public void Row_하나_생성(){
        assertEquals(true,row.getPoints()[0].isNone());
        assertEquals(true,row.getPoints()[1].isNone());
        assertEquals(true,row.getPoints()[2].isNone());
    }

    @Test
    public void Row_선_추가(){
        //given
        Position startPos = Position.of(1);

        //when
        row.setLine(startPos);

        //then
        assertEquals(true,row.getPoints()[1].isRight());
        assertEquals(true,row.getPoints()[0].isNone());
        assertEquals(true,row.getPoints()[2].isLeft());
    }

    @Test
    public void Row_선_추가_오류(){
        // 마지막 인덱스 오류
        assertThrows(RuntimeException.class, () -> {
            row.setLine(Position.of(2));
        });

        // 인덱스 범위 초과 오류
        assertThrows(RuntimeException.class, () -> {
            row.setLine(Position.of(3));
        });
    }

}