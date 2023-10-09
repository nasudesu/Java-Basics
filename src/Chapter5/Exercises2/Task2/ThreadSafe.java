package Chapter5.Exercises2.Task2;

public class ThreadSafe extends Thread{
    Arraylistclass arraylistclass;
    private static int thread = 0;
    private final int id;

    ThreadSafe(Arraylistclass arraylistclass){
        this.arraylistclass = arraylistclass;
        this.id = ++thread;
    }
    public void getListSize(){
        System.out.println("Thread " + this.id + " List Size: " + arraylistclass.getListSize());
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            arraylistclass.addItem("Item");
        }
        for (int i = 0; i < 1000; i++) {
            arraylistclass.removeItem("Item");
        }
    }
}
