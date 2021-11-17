package com.company.Classes.Task_5;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициа-
 * лизацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния, и метод позволяющее получить
 * его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {    public int currentNumber;
    public int startCounterNumber;
    public int finalCounterNumber;

    public Counter(int currentNumber, int startCounterNumber, int finalCounterNumber) {
        this.currentNumber = currentNumber;
        this.startCounterNumber = startCounterNumber;
        this.finalCounterNumber = finalCounterNumber;
    }

    public Counter() {
        this.currentNumber = 1;
        this.startCounterNumber = 0;
        this.finalCounterNumber = 10;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void increaseNumber(){
        if (currentNumber < finalCounterNumber){
            currentNumber++;
            System.out.println("Значение счётчика: "+currentNumber);
        }
        if (currentNumber == finalCounterNumber) System.out.println("Достигнуто максимальное значение: "+currentNumber);
    }

    public void decreaseNumber(){
        if (currentNumber > startCounterNumber){
            currentNumber--;
            System.out.println("Значение счётчика: "+currentNumber);
        }
        if (currentNumber == startCounterNumber) System.out.println("Достигнуто минимальное значение: "+currentNumber);
    }
}

