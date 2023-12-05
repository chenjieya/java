package domain;

public class Person {

    private Integer pid;
    private String pname;
    private CardId cardId;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cardId=" + cardId +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public CardId getCardId() {
        return cardId;
    }

    public void setCardId(CardId cardId) {
        this.cardId = cardId;
    }

    public Person(Integer pid, String pname, CardId cardId) {
        this.pid = pid;
        this.pname = pname;
        this.cardId = cardId;
    }

    public Person() {
    }
}
