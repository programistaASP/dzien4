package Adnotacje;

public class Start {
    @MaxLenght(minValue = 10)
    String name = "Anna";

    public void setName(String name){
        this.name = name;
        try {
            if (!TeddyBearAgeValidator.validate(this)) {
                throw new IllegalAccessException("Niepoprawna wartość");
            }
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
