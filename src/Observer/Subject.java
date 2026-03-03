package Observer;

public interface Subject {

    void addobserver(Observer observer);
    void removeobserver(Observer observer);
    void notifyobserver();
}
