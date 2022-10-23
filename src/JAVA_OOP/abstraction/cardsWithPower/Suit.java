package JAVA_OOP.abstraction.cardsWithPower;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private final int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}