package hu.progmatic;

public class Színész extends SzíntársulatiTag{

    private Szerepek szerep;
    private SzinesziTehetseg szinesziTehetseg;

    public Színész(String name, int ber, Szerepek szerep, SzinesziTehetseg szinesziTehetseg) {
        super(name, ber);
        this.szerep = szerep;
        this.szinesziTehetseg = szinesziTehetseg;
    }

    public Szerepek getSzerep() {
        return szerep;
    }

    public void setSzerep(Szerepek szerep) {
        this.szerep = szerep;
    }

    public SzinesziTehetseg getSzinesziTehetseg() {
        return szinesziTehetseg;
    }

    public void setSzinesziTehetseg(SzinesziTehetseg szinesziTehetseg) {
        this.szinesziTehetseg = szinesziTehetseg;
    }

    @Override
    public String toString() {
        return "szerep=" + szerep +
                "szinesziTehetseg=" + szinesziTehetseg;
    }
}
