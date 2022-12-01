package bowling.domain;

public class Frame {

    private final Pins pins;

    public Frame(int countOfPins) {
        this.pins = new Pins(countOfPins);
    }


}
