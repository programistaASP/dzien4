package obiektowe;

public class Konto {
    long numerKonta;
    int stanKonta;

    public Konto(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public void wyswietlStanKonta() {
        System.out.println("Stan konta nr: " + this.numerKonta + " jest równy: " + this.stanKonta);
    }

    public void wplacSrodki(int kwotaWplacona) {
        this.stanKonta += kwotaWplacona;

    }

    public int pobierzSrodki(int kwotaPobrana) {
        this.stanKonta -= kwotaPobrana;
        return kwotaPobrana;


    }

}




