package hu.progmatic;

public class Kellékes extends SzíntársulatiTag {
    private String[] kellekek;

    public Kellékes(String name, int ber, String[] kellekek) {
        super(name, ber);
        this.kellekek = kellekek;
    }
    String[] kellékes1 = {
            String.valueOf(new String[]{"Monitor","Billenytűzet","Egér",}),

    };


    public String[] getKellekek() {
        return kellekek;
    }

    public void setKellekek(String[] kellekek) {
        this.kellekek = kellekek;
    }
}

