package hu.progmatic;

public class Rendezo extends SzíntársulatiTag {
    private int rendezoiTapasztalat;
    private int eloadottSzindarabok;

    public Rendezo(String name, int ber, int rendezoiTapasztalat, int eloadottSzindarabok) {
        super(name, ber);
        this.rendezoiTapasztalat = rendezoiTapasztalat;
        this.eloadottSzindarabok = eloadottSzindarabok;
    }

    public int getRendezoiTapasztalat() {
        return rendezoiTapasztalat;
    }

    public void setRendezoiTapasztalat(int rendezoiTapasztalat) {
        this.rendezoiTapasztalat = rendezoiTapasztalat;
    }

    public int getEloadottSzindarabok() {
        return eloadottSzindarabok;
    }

    public void setEloadottSzindarabok(int eloadottSzindarabok) {
        this.eloadottSzindarabok = eloadottSzindarabok;
    }
}
