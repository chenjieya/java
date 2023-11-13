package DoMain;

public class AreaClass {
    private Integer aid;
    private String aname;
    private CountryClass countryClass;

    public AreaClass() {
    }

    public AreaClass(Integer aid, String aname, CountryClass countryClass) {
        this.aid = aid;
        this.aname = aname;
        this.countryClass = countryClass;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setCountryClass(CountryClass countryClass) {
        this.countryClass = countryClass;
    }

    public Integer getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public CountryClass getCountryClass() {
        return countryClass;
    }
}
