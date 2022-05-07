package hu.progmatic;

import java.util.Arrays;

public class Színtársulat {

    private Színész[] színészek;
    private SzíntársulatiTag[] színtársulatiTags;
    private String színTársulatNeve;

    public Színtársulat(Színész[] színészek, SzíntársulatiTag[] színtársulatiTags, String színTársulatNeve) {
        this.színészek = színészek;
        this.színtársulatiTags = színtársulatiTags;
        this.színTársulatNeve = színTársulatNeve;
    }

    @Override
    public String toString() {
        return "színészek=" + Arrays.toString(színészek) +
                "színtársulatiTags=" + Arrays.toString(színtársulatiTags) +
                "színTársulatNeve='" + színTársulatNeve ;
    }

    public Színész[] getSzínészek() {
        return színészek;
    }

    public void setSzínészek(Színész[] színészek) {
        this.színészek = színészek;
    }

    public SzíntársulatiTag[] getSzíntársulatiTags() {
        return színtársulatiTags;
    }

    public void setSzíntársulatiTags(SzíntársulatiTag[] színtársulatiTags) {
        this.színtársulatiTags = színtársulatiTags;
    }

    public String getSzínTársulatNeve() {
        return színTársulatNeve;
    }

    public void setSzínTársulatNeve(String színTársulatNeve) {
        this.színTársulatNeve = színTársulatNeve;
    }
}
