package domain;

public class CardID {

    private String cardid;
    private String card_address;
    private Person person;

    public CardID() {
    }

    @Override
    public String toString() {
        return "CardID{" +
                "cardid='" + cardid + '\'' +
                ", card_address='" + card_address + '\'' +
                ", person=" + person +
                '}';
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCard_address() {
        return card_address;
    }

    public void setCard_address(String card_address) {
        this.card_address = card_address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CardID(String cardid, String card_address, Person person) {
        this.cardid = cardid;
        this.card_address = card_address;
        this.person = person;
    }
}
