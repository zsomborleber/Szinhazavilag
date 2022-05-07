package hu.progmatic;

public class Main {

    public static void main(String[] args) {

        Színész[] színészek = {
                new Színész ("Gyula",15_000,Szerepek.gyerek,SzinesziTehetseg.gyenge),
            new Színész("Zita",15_000,Szerepek.felnőttNői,SzinesziTehetseg.átlagos),
            new Színész("András",15_000,Szerepek.bármilyenFelnőtt,SzinesziTehetseg.tehetséges),
            new Színész("Enci",15_000,Szerepek.felnőttNői,SzinesziTehetseg.tehetséges),
            new Színész("Zsombor",15_000,Szerepek.felnőttFérfi,SzinesziTehetseg.nagyonGyenge),
        };

        Szerep[] szerep = {
                new Szerep("Junior Developer"),
                new Szerep("Mid Developer"),
                new Szerep("Senior Developer"),
                new Szerep("Expert Developer"),
                new Szerep("God Developer"),
        };
        

        SzínészSzerep[] színészSzerep = {
                new SzínészSzerep(színészek[0],szerep[0]),
                new SzínészSzerep(színészek[1],szerep[1]),
                new SzínészSzerep(színészek[2],szerep[2]),
                new SzínészSzerep(színészek[3],szerep[3]),
                new SzínészSzerep(színészek[4],szerep[4]),

        };



        Színdarab színdarab = new Színdarab("Ria, Balázs","Progmatic szinHÁZ",2,szerep[1]);


        Előadás előadás = new Előadás(színdarab,színészek,színészSzerep);



        Object[] datasheets = {
                színdarab,
                "=========================================================",
                színészSzerep[0],
                "=========================================================",
                színészSzerep[1],
                "=========================================================",
                színészSzerep[2],
                "=========================================================",
                színészSzerep[3],
                "=========================================================",
                színészSzerep[4],
        };
        for (Object datasheet : datasheets ){
            System.out.println(datasheet);
        }

    }
}
