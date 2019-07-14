package obiektowe;

class MyException extends Exception{
    public MyException() {
        System.out.println("Utworzenie wyjątku");
    }
}
class ExceptionSample {
    public void doSomething() throws MyException{
        System.out.println("Zgłoszenie wyjątku MyException");
        throw new MyException();
    }
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        try {
            sample.doSomething();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("Wyjątek został złapany");
        }
    }
}