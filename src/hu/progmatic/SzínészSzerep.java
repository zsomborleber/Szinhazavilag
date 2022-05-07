package hu.progmatic;

public class SzínészSzerep {
    private Színész színész;
    private Szerep szerep;

    public SzínészSzerep(Színész színész, Szerep szerep) {
        this.színész = színész;
        this.szerep = szerep;
    }

    public Színész getSzínész() {
        return színész;
    }

    public void setSzínész(Színész színész) {
        this.színész = színész;
    }

    public Szerep getSzerep() {
        return szerep;
    }

    public void setSzerep(Szerep szerep) {
        this.szerep = szerep;
    }

    @Override
    public String toString() {
        return
                "Színész: " + színész +
                "Szerep: " + szerep + "\n";

    }
}
