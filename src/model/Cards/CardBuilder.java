package model.Cards;

public class CardBuilder {

    int value;
    int suit;
    String color;
    String image;


    /**
     * @param value Returns the value of a card eg: 1,2,3...13
     * @return
     */
    public CardBuilder value(int value) {
        this.value = value;
        return this;
    }

    /**
     * @param suit Returns the Suit rank of a Card in values ranging from 1 to 4 where 1 might be Spades, 2 Harts etc...
     * @return
     */
    public CardBuilder suit(int suit) {
        this.suit = suit;
        return this;
    }

    /**
     * @param color Returns the color of the card eg. red/black/etc...
     * @return
     */
    public CardBuilder color(String color) {
        this.color = color;
        return this;
    }

    /**
     * @param image returns the image string of the card. Eg. /src/Images/French/AceSpades.jpg
     * @return
     */
    public CardBuilder image(String image) {
        this.image = image;
        return this;
    }

    /**
     * @return Initialize the build sequence of a card.
     */
    public Card build() {
        Card card = new Card(this);
        validateCardObject(card);
        return card;
    }

    /**
     * @param card Validates all the parameters entered.
     */
    private void validateCardObject(Card card) {
        if (card.getSuit() > 13 || card.getSuit() < 1) {
            System.out.println("Invalid User input on Value. Must be between 1 and 13");
        }
        if (card.getSuit() > 4 || card.getSuit() < 1) {
            System.out.println("Invalid User input on Value. Must be between 1 and 13");
        }


    }


}
