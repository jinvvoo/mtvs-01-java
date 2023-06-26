package section04.uses3;

public class Dicer {

    private int curruntPosition;

    public void throwDice(Dice dice) {

        int diceNumber = dice.getNumber();
        move(diceNumber);
    }

    private void move(int diceNumber) {
        this.curruntPosition += diceNumber;
    }
}
