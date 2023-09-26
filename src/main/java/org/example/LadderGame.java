package org.example;

import org.example.creator.LadderCreator;
import org.example.runner.LadderRunner;

public class LadderGame {
    private final LadderCreator ladderCreator;

    public LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }

    public int run(Position position){
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());
        ladderRunner.run(position);

        return position.getPosition();
    }
}
