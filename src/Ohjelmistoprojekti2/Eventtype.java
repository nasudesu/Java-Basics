package Ohjelmistoprojekti2;

public enum Eventtype {
    ARRIVAL(1),
    EXITING(2);
    final int num;
    Eventtype(int num) {
        this.num = num;
    }
}
