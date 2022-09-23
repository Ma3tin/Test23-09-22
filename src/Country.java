public class Country {
    // nazev gpd population hdp(gdp/population)
    // name continent area population gdp capital tld flag
    private String name; //0
    private String continent; //1
    private long gpd; //4
    private long population; //3
    private long hdp;
    private float ratio;

    public Country(String name, String continent, long gpd, long population) {
        this.name = name;
        this.continent = continent;
        this.gpd = gpd;
        this.population = population;
        this.hdp = gpd/population;
        this.ratio = 0;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public long getGpd() {
        return gpd;
    }

    public long getPopulation() {
        return population;
    }

    public long getHdp() {
        return hdp;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }
}
