package obiektowe;

public class main2 {
    public static void main(String[] args) {
        Sala newYork = new Sala(50,34,
                10,12,20,true,
                false,true);

        Sala washington = new Sala(130,70,70,
                30,35,true,true,false);

        Sala portland = new Sala(140,90,90,50,
                46,false,false,false);

        Sala vegas = new Sala(200,120,120,
                30,20,false,false,true);

        Sala bronx = new Sala(112,30,30,
                12,20,true,
                false,false);



        newYork.opisSali();
        washington.opisSali();
        portland.opisSali();
        vegas.opisSali();
        bronx.opisSali();
    }
}
