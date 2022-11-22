package bowling.domain;

import bowling.exception.CannotCalculateException;

public class Score {
    private int score;
    private int left;

    public Score(int score, int left) {
        this.score = score;
        this.left = left;
    }

    public Score bowl(int countOfPins) {
        return new Score(this.score += countOfPins, this.left - 1);
    }

    public int getScore() {
        if (!canCalculateScore()) {
            throw new CannotCalculateException();
        }
        return this.score;
    }

    public boolean canCalculateScore() {
        return this.left == 0;
    }
}
