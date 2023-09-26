package org.example.runner;

import org.example.ExceptionMessage;
import org.example.Position;
import org.example.Row;

public class LadderRunner {
    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public int run(Position position){
        position=position.prev();
        validationStartPosition(position);

        for(int i=0;i<rows.length;i++){
            position=rows[i].nextPosition(position);
        }

        return position.getPosition()+1;
    }

    public void validationStartPosition(Position startPosition){
        if(!Position.isPosition(startPosition.getPosition())
                || startPosition.getPosition()>rows[0].getPersonNum()-1) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_POSITION.getMessage());
        }
    }
}
