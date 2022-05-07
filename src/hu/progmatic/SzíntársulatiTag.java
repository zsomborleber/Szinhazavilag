package hu.progmatic;

public class SzíntársulatiTag  {
    private String name;
    private int ber;

    public SzíntársulatiTag(String name, int ber) {
        this.name = name;
        this.ber = ber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBer() {
        return ber;
    }

    public void setBer(int ber) {
        this.ber = ber;
    }


}
