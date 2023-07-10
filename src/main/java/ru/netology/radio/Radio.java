package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        } else currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
          return;
        } else currentVolume = currentVolume - 1;
    }


    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else currentRadioStation = currentRadioStation - 1;
    }

    public void setCurrentRadioStation (int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


}
