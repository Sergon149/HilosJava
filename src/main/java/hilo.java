import com.sun.tools.javac.Main;

public class hilo extends Thread{

    public String nombre;

    public hilo(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo "+nombre+" y me voy a dormir.");

        try {
            Thread.sleep(main.getRandomTimeInMills());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo "+nombre+" y me voy a despertar.");
    }
}
