package hu.progmatic;

public class Kellékes extends SzíntársulatiTag {
    private String[] kellekek;

    public Kellékes(String name, int ber, String[] kellekek) {
        super(name, ber);
        this.kellekek = kellekek;
    }

    public String[] getKellekek() {
        return kellekek;
    }

    public void setKellekek(String[] kellekek) {
        this.kellekek = kellekek;
    }
}

