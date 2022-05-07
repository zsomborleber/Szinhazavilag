package hu.progmatic;

public class Színdarab {
    private String szerző;
    private String címét;
    private int felvonásokSzáma;
    private Szerep szerepek ;



    public Színdarab(String szerző, String címét, int felvonásokSzáma, Szerep szerepek) {
        this.szerző = szerző;
        this.címét = címét;
        this.felvonásokSzáma = felvonásokSzáma;
        this.szerepek = szerepek;
    }

    @Override
    public String toString() {
        return"szerző: " + szerző +
                ", Előadás Címe: " + címét +
                ", felvonásokSzáma: " + felvonásokSzáma +
                ", szerepek: " + szerepek;
    }

    public String getSzerző() {
        return szerző;
    }

    public void setSzerző(String szerző) {
        this.szerző = szerző;
    }

    public String getCímét() {
        return címét;
    }

    public void setCímét(String címét) {
        this.címét = címét;
    }

    public int getFelvonásokSzáma() {
        return felvonásokSzáma;
    }

    public void setFelvonásokSzáma(int felvonásokSzáma) {
        this.felvonásokSzáma = felvonásokSzáma;
    }

    public Szerep getSzerepek() {
        return szerepek;
    }

    public void setSzerepek(Szerep szerepek) {
        this.szerepek = szerepek;
    }
}
