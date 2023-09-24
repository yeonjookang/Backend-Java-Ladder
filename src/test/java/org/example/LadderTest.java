package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @Test
    public void Ladder_하나_생성(){
        //given
        int height=3;
        int person=4;

        //when
        Ladder ladder = new Ladder(person,height);

        //then
        assertEquals(0,ladder.getRows()[0].getPoints()[0]);
        assertEquals(0,ladder.getRows()[0].getPoints()[1]);
        assertEquals(0,ladder.getRows()[0].getPoints()[2]);
        assertEquals(0,ladder.getRows()[0].getPoints()[3]);

        assertEquals(0,ladder.getRows()[1].getPoints()[0]);
        assertEquals(0,ladder.getRows()[1].getPoints()[1]);
        assertEquals(0,ladder.getRows()[1].getPoints()[2]);
        assertEquals(0,ladder.getRows()[1].getPoints()[3]);

        assertEquals(0,ladder.getRows()[2].getPoints()[0]);
        assertEquals(0,ladder.getRows()[2].getPoints()[1]);
        assertEquals(0,ladder.getRows()[2].getPoints()[2]);
        assertEquals(0,ladder.getRows()[2].getPoints()[3]);

        assertEquals(0,ladder.getRows()[3].getPoints()[0]);
        assertEquals(0,ladder.getRows()[3].getPoints()[1]);
        assertEquals(0,ladder.getRows()[3].getPoints()[2]);
        assertEquals(0,ladder.getRows()[3].getPoints()[3]);
    }

    @Test
    public void 사다리게임_테스트(){
        //given
        int height=3;
        int person=4;

        //when
        Ladder ladder = new Ladder(person,height);

        //then
        assertEquals(1,ladder.run(1));
        assertEquals(2,ladder.run(2));
        assertEquals(3,ladder.run(3));
        assertEquals(4,ladder.run(4));
    }

    @Test
    public void 사다리_라인생성후_테스트(){
        //given
        int height=3;
        int person=4;

        //when
        Ladder ladder = new Ladder(person,height);
        ladder.drawLine(0,1);
        ladder.drawLine(1,2);
    }

    @Test
    public void 사다리게임_라인생성후_테스트(){
        //given
        int height=3;
        int person=4;

        //when
        Ladder ladder = new Ladder(person,height);
        ladder.drawLine(0,1);
        ladder.drawLine(1,2);

        //then
        assertEquals(3,ladder.run(1));
        assertEquals(1,ladder.run(2));
        assertEquals(2,ladder.run(3));
        assertEquals(4,ladder.run(4));
    }
}