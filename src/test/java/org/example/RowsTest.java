package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RowsTest {

    Row row = new Row(3);

    @Test
    public void Row_하나_생성(){
        assertEquals(0,row.getPoints()[0]);
        assertEquals(0,row.getPoints()[1]);
        assertEquals(0,row.getPoints()[2]);
    }

    @Test
    public void Row_선_추가(){
        //given
        int startPos = 1;

        //when
        row.setLine(startPos);

        //then
        assertEquals(Direction.RIGHT.getValue(),row.getPoints()[1]);
        assertEquals(Direction.NONE.getValue(),row.getPoints()[0]);
        assertEquals(Direction.LEFT.getValue(),row.getPoints()[2]);
    }

    @Test
    public void Row_선_추가_오류(){
        // 마지막 인덱스 오류
        assertThrows(RuntimeException.class, () -> {
            row.setLine(2);
        });

        // 인덱스 범위 초과 오류
        assertThrows(RuntimeException.class, () -> {
            row.setLine(3);
        });
    }

}