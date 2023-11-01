public class Ticket {
    private String start;
    private String end;
    private Float price;

    public Ticket() {}
    public Ticket(String start, String end, Float price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getStart() {
        return this.start;
    }
    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
