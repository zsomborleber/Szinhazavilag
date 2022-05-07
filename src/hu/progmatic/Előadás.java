package hu.progmatic;

import java.util.Arrays;

public class Előadás {

    private Színdarab Színdarab;
    private Színész[] Progmatic;
    private SzínészSzerep[] FellépőSzínészek;

    public Előadás(Színdarab színdarab, Színész[] progmatic, SzínészSzerep[] szineszek) {
        Színdarab = színdarab;
        Progmatic = progmatic;
        this.FellépőSzínészek = szineszek;
    }

    public String[] getActToActor() {
        return null;
    };

    @Override
    public String toString() {
        return   Színdarab +
                " Társulat=" + Progmatic +
                " FellépőSzínészek=" + Arrays.toString(FellépőSzínészek);
    }

    public Színdarab getSzíndarab() {
        return Színdarab;
    }

    public void setSzíndarab(Színdarab színdarab) {
        this.Színdarab = színdarab;
    }

    public Színész[] getProgmatic() {
        return Progmatic;
    }

    public void setProgmatic(Színész[] progmatic) {
        Progmatic = progmatic;
    }

    public SzínészSzerep[] getFellépőSzínészek() {
        return FellépőSzínészek;
    }

    public void setFellépőSzínészek(SzínészSzerep[] fellépőSzínészek) {
        this.FellépőSzínészek = fellépőSzínészek;
    }



}
