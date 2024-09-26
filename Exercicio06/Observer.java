package Exercicio06;

/*Questão revisada e feita a implementação do metodo notifyObservers */

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void updateSubject(); 
}

class Subject{
    private List<Observer> observers = new ArrayList<>(); 

    public void addObserver(Observer observer){
        observers.add(observer); 
    }

    public void notifyObservers() { 
        for(Observer observer : observers){
            observer.updateSubject();
        }
    }
}

