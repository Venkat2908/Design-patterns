package Pratise.Builder.Observer;

import java.util.ArrayList;

public class Weatherstation implements Subject {

    int temperature;
    ArrayList<Observer> list = new ArrayList<>();
    @Override
    public void addobserver(Observer observer) {
        list.add(observer);

    }

    @Override
    public void removeobserver(Observer observer) {
    list.remove(observer);
    }

    @Override
    public void notifyobserver() {
    for (Observer observer:list){
        observer.update(temperature);
    }
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;

        System.out.println("weather station : Temperature updated"+temperature);
        notifyobserver();
    }
}
