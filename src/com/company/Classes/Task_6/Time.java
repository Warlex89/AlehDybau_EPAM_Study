package com.company.Classes.Task_6;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности
 * установки времени и изменения его отдельных полей (час, минута, секунда) с
 * проверкой допустимости вводимых значений. В случае недопустимых значений полей
 * поле устанавливается в значение 0. Создать методы изменения времени на задан-
 * ное количество часов, минут и секунд.
 */

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void setHours(int hours) {
        if (hours > 24 || hours < 1){
            this.hours = 0;
        } else this.hours = hours;
        getCurrentTime();
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 1){
            this.hours = 0;
        } else this.minutes = minutes;
        getCurrentTime();
    }

    public void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 1){
            this.seconds = 0;
        }
        else this.seconds = seconds;
        getCurrentTime();
    }

    public void changeHours(int hours){
        this.hours = this.hours + hours;
        if(this.hours >= 24){
            this.hours = 0;
            System.out.println("В сумме, часов больше 24");
        }
        getCurrentTime();
    }

    public void changeMinutes(int minutes){
        this.minutes = this.minutes + minutes;
        if (this.minutes >= 60){
            this.hours = this.hours + this.minutes/60;
            if (this.hours >= 24){
                this.hours = 0;
                System.out.println("В сумме, часов больше 24");
            }
            this.minutes = this.minutes % 60;
        }
        getCurrentTime();
    }

    public void changeSeconds(int seconds){
        this.seconds = this.seconds + seconds;
        if (this.seconds >= 60){
            this.minutes = this.minutes + this.seconds/60;
            if (this.minutes >= 60){
                this.hours = this.hours + this.minutes/60;
                if (this.hours >= 24){
                    this.hours = 0;
                    System.out.println("В сумме, часов больше 24");
                }
                this.minutes = this.minutes % 60;
            }
            this.seconds = this.seconds % 60;
        }
        getCurrentTime();
    }

    public void getCurrentTime(){
        System.out.println("Текущее время: "+String.format("%d:%d:%d",this.hours, this.minutes, this.seconds));
    }
}
