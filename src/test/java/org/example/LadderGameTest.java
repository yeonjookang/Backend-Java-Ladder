package org.example;

import org.example.creator.LadderCreator;
import org.example.runner.LadderRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LadderGameTest {

    @Test
    public void Ladder_하나_생성(){
        //given
        NaturalNumber height=NaturalNumber.of(3);
        NaturalNumber person=NaturalNumber.of(4);

        //when
        LadderCreator ladderCreator = new LadderCreator(person,height);

        //then
        assertEquals(true,ladderCreator.getRows()[0].getPoints()[0].isNone());
        assertEquals(true,ladderCreator.getRows()[0].getPoints()[1].isNone());
        assertEquals(true,ladderCreator.getRows()[0].getPoints()[2].isNone());
        assertEquals(true,ladderCreator.getRows()[0].getPoints()[3].isNone());

        assertEquals(true,ladderCreator.getRows()[1].getPoints()[0].isNone());
        assertEquals(true,ladderCreator.getRows()[1].getPoints()[1].isNone());
        assertEquals(true,ladderCreator.getRows()[1].getPoints()[2].isNone());
        assertEquals(true,ladderCreator.getRows()[1].getPoints()[3].isNone());

        assertEquals(true,ladderCreator.getRows()[2].getPoints()[0].isNone());
        assertEquals(true,ladderCreator.getRows()[2].getPoints()[1].isNone());
        assertEquals(true,ladderCreator.getRows()[2].getPoints()[2].isNone());
        assertEquals(true,ladderCreator.getRows()[2].getPoints()[3].isNone());

        assertEquals(true,ladderCreator.getRows()[3].getPoints()[0].isNone());
        assertEquals(true,ladderCreator.getRows()[3].getPoints()[1].isNone());
        assertEquals(true,ladderCreator.getRows()[3].getPoints()[2].isNone());
        assertEquals(true,ladderCreator.getRows()[3].getPoints()[3].isNone());
    }

    @Test
    public void 사다리게임_테스트(){
        //given
        NaturalNumber height=NaturalNumber.of(3);
        NaturalNumber person=NaturalNumber.of(4);

        //when
        LadderCreator ladderCreator = new LadderCreator(person,height);
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());

        //then
        assertEquals(1,ladderRunner.run(Position.of(1)));
        assertEquals(2,ladderRunner.run(Position.of(2)));
        assertEquals(3,ladderRunner.run(Position.of(3)));
        assertEquals(4,ladderRunner.run(Position.of(4)));
    }

    @Test
    public void 사다리_라인생성후_테스트(){
        //given
        NaturalNumber height=NaturalNumber.of(3);
        NaturalNumber person=NaturalNumber.of(4);

        //when
        LadderCreator ladderCreator = new LadderCreator(person,height);
        ladderCreator.drawLine(Position.of(0),Position.of(1));
        ladderCreator.drawLine(Position.of(1),Position.of(2));
    }

    @Test
    public void 사다리게임_라인생성후_테스트(){
        //given
        NaturalNumber height=NaturalNumber.of(3);
        NaturalNumber person=NaturalNumber.of(4);

        //when
        LadderCreator ladderCreator = new LadderCreator(person,height);
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());

        ladderCreator.drawLine(Position.of(0),Position.of(1));
        ladderCreator.drawLine(Position.of(1),Position.of(2));

        //then
        assertEquals(3,ladderRunner.run(Position.of(1)));
        assertEquals(1,ladderRunner.run(Position.of(2)));
        assertEquals(2,ladderRunner.run(Position.of(3)));
        assertEquals(4,ladderRunner.run(Position.of(4)));
    }
}