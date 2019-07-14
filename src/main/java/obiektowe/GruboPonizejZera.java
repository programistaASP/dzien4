package obiektowe;

public class GruboPonizejZera extends Exception
{
    // Parameterless Constructor
    public GruboPonizejZera()
    {
        System.err.println("Konstruktor bledu GruboPonizejZera");
    }
    // Constructor that accepts a message
    public GruboPonizejZera(String message)
    {
        super(message);
    }
}
