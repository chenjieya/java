package domain;

public class AreaClass {

    private Integer aid;
    private String aname;
    private CountryClass countryClass;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public AreaClass(Integer aid, String aname, CountryClass countryClass) {
        this.aid = aid;
        this.aname = aname;
        this.countryClass = countryClass;
    }

    public AreaClass() {
    }

    public CountryClass getCountryClass() {
        return countryClass;
    }

    public void setCountryClass(CountryClass countryClass) {
        this.countryClass = countryClass;
    }
}
