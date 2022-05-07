package hu.progmatic;

import java.util.Arrays;

public class Szerep {
    private String szerep;

    public Szerep(String szerep) {
        this.szerep = szerep;
    }

    public String getSzerep() {
        return szerep;
    }

    public void setSzerep(String szerep) {
        this.szerep = szerep;
    }

    @Override
    public String toString() {
        return
                "\nszerep: " + szerep;
    }
}
