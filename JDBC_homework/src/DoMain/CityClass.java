package DoMain;

public class CityClass {
    private Integer cityid;
    private String cityname;
    private Integer citysize;
    private AreaClass areaClass;

    public CityClass() {
    }

    public CityClass(Integer cityid, String cityname, Integer citysize, AreaClass areaClass) {
        this.cityid = cityid;
        this.cityname = cityname;
        this.citysize = citysize;
        this.areaClass = areaClass;
    }

    public Integer getCityid() {
        return cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public Integer getCitysize() {
        return citysize;
    }

    public AreaClass getAreaClass() {
        return areaClass;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setCitysize(Integer citysize) {
        this.citysize = citysize;
    }

    public void setAreaClass(AreaClass areaClass) {
        this.areaClass = areaClass;
    }
}
