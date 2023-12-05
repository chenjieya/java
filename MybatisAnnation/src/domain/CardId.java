package domain;

public class CardId {

    private String cardid;
    private String card_address;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CardId(String cardid, String card_address, Person person) {
        this.cardid = cardid;
        this.card_address = card_address;
        this.person = person;
    }

    @Override
    public String toString() {
        return "CardId{" +
                "cardid='" + cardid + '\'' +
                ", card_address='" + card_address + '\'' +
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


    public CardId() {
    }
}
