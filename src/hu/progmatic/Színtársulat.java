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
    String[] kellékes1 = {
            String.valueOf(new String[]{"Monitor","Billenytűzet","Egér",}),

    };
    String[] kellékes2 = {
            String.valueOf(new String[]{"Asztal", "Szék",}),
    };

    SzíntársulatiTag[]színtársulatiTagok= {
            new SzíntársulatiTag("Gyula",15_000),
            new SzíntársulatiTag("Zita",20_000),
            new SzíntársulatiTag("András",25_000),
            new SzíntársulatiTag("Enci",30_000),
            new SzíntársulatiTag("zsombor",45_000),
            new Rendezo("Ria",60_000,10,99),
            new Rendezo("Balázs",60_000,10,99),
            new Kellékes("Barni",10_000,kellékes1),
            new Kellékes("Áron",10_000,kellékes2)
    };

    Színtársulat[] színtársulats = {
            new Színtársulat(színészek,színtársulatiTagok,"FutureOFDevelopers")
    };

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
