package ru.netology.radio;

public class Radio {
    private static final int defaultStationCount = 10;
    private static final int maxVolume = 100;

    private int stationCount = 0;

    private int currentRadioStation = 0;

    private int currentVolume = 0;


    public Radio(int stationCount) {
        if (stationCount <= 0) {
            this.stationCount = defaultStationCount;
        } else {
            this.stationCount = stationCount;
        }

    }

    public Radio() {
        this(defaultStationCount);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }


    public void nextRadioStation() {
        if (currentRadioStation + 1 == stationCount) {
            currentRadioStation = 0;
        } else currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = stationCount - 1;
        } else currentRadioStation--;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation + 1 < stationCount && currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= maxVolume) {
            this.currentVolume = currentVolume;
        }
    }


}
