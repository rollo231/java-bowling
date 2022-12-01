package bowling.domain;

public enum PinsStatus {

    STRIKE(true),
    SPARE(true),
    MISS(false),
    GUTTER(false),
    ;
    private final boolean isEnd;

    PinsStatus(boolean isEnd) {
        this.isEnd = isEnd;
    }

    public boolean isEnd() {
        return isEnd;
    }
}
