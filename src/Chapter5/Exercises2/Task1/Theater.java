package Chapter5.Exercises2.Task1;

public class Theater{
    private int tickets;

    Theater(int tickets){
        this.tickets = tickets;
    }

    public synchronized boolean getTicket() {
        if (tickets > 0){
            tickets--;
            return true;
        }else {
            return false;
        }
    }
}
