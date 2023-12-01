package domain;

public class Person {

    private Integer pid;
    private String pname;
    private CardID cardid;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cardid=" + cardid +
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

    public CardID getCardid() {
        return cardid;
    }

    public void setCardid(CardID cardid) {
        this.cardid = cardid;
    }

    public Person(Integer pid, String pname, CardID cardid) {
        this.pid = pid;
        this.pname = pname;
        this.cardid = cardid;
    }
}
