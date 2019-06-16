public class WyrazeniaRegularne {
    public static void main(String[] args)
    {
        String pierwszyCiag = "To jest pierwszy ciąg.";
        String drugiCiag = "Pani Ala ma 30 lat i 57 kotów z Polski, Anglii i Egiptu.";
        String teksDoPodmiany = "???";

        System.out.println(zlacz(pierwszyCiag,drugiCiag));
        System.out.println(usuwanieSamoglosek(drugiCiag));
        System.out.println(usuwanieCyfr(drugiCiag));
        System.out.println(zamianaNaInnyTekst(drugiCiag, teksDoPodmiany));

    }

    public static String zlacz(String pierwszyCiag, String drugiCiag)
    {
        pierwszyCiag = pierwszyCiag.trim().substring(1,pierwszyCiag.trim().length()-1);
        drugiCiag = drugiCiag.trim().substring(1,drugiCiag.trim().length()-1);;

        String zlacze = pierwszyCiag + drugiCiag;

        return zlacze;
    }

    public static String usuwanieSamoglosek(String drugiCiag)
    {
        String bezSamoglosek = drugiCiag.replaceAll("[AaEeIiOoUuYyĄąĘęÓó]","");

        return bezSamoglosek;
    }

    public static String usuwanieCyfr(String drugiCiag)
    {
        String bezCyfr = drugiCiag.replaceAll("\\d{2,}","");

        return bezCyfr;
    }

    public static String zamianaNaInnyTekst(String drugiCiag, String tekstDoPodmiany)
    {
        String poPodmianie = drugiCiag.replaceAll("(\\s|\\W|^)[A-Z]\\w{0,}",tekstDoPodmiany);

        return poPodmianie;
    }

}
