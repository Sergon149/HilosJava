import java.util.Random;

public class main {

    public static void main(String[] args){
        System.out.println("Hola comenzamos a las "+System.currentTimeMillis());

            hilo h1 = new hilo("Hilo 1");
            hilo h2 = new hilo("Hilo 2");



            h1.start();
            h2.start();


        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hola terminamos a las "+System.currentTimeMillis());
    }
    public static Integer getRandomTimeInMills(){
        Random r = new Random();
        return r.nextInt((3)+2) * 1000;
    }
}
