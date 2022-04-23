package ru.netology.domain;

public class Radio {
    private int maxStation;
    private int minStation = 0;
    private int currentStation;//-------Номер текущей радиостанции----
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;//-------текущая громкость----

    public Radio() {
        this.maxStation = 9;//это конструктор
    }

    public Radio(int summStations) {// счетчик
        this.maxStation = summStations - 1;
    }

    public int getCurrentStation() {// получить № станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {//установить текущую станцию Тута
        if (currentStation < minStation) {//меньше минимума
            return;
        }
        if (currentStation > maxStation) {//больше максимума, а он в конструкторе
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {//+1 станция
        if (currentStation == maxStation) {//тек=или нет мах?
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void prev() {//нажал на кнопку предыдущая
        if (currentStation == minStation) {//тек=или нет мin?
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {//получить урзвука
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {//установить урзвука
        if (currentVolume < minVolume) {//меньше минимума
            return;
        }
        if (currentVolume > maxVolume) {//больше максимума, а он в конструкторе
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumePlus() {//громкость+ максимального
        if (currentVolume == maxVolume) { //тек=или нет мax?
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void volumeMinus() {//громкость- низшего
        if (currentVolume == minVolume) {   //(в пределах от 0 до 100)
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}