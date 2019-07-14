package obiektowe;

public class Konto
{
    long numerKonta;
    double stanKonta;

    public Konto(long numerKonta, double stanKonta)
    {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public void wyswietlStanKonta()
    {
        System.out.println("Stan konta nr: " + this.numerKonta + " jest równy: " + this.stanKonta);
    }

    public void wplacSrodki(int kwotaWplacona)
    {
        this.stanKonta += kwotaWplacona;

    }

    public int pobierzSrodki(int kwotaPobrana) throws GruboPonizejZera
    {
            if(this.stanKonta<kwotaPobrana)
            {
                throw new GruboPonizejZera();
            }
            this.stanKonta -= kwotaPobrana;
            return kwotaPobrana;



    }

}