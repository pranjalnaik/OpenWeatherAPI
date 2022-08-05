package com.pjnaik.openweatherapp;

public class Utils {

    public int tempInCelcius(int temp) {
        return (int) Math.ceil((temp - 32) * 0.5556);
    }

    public int tempInFahren(int temp) {
        return (int) Math.ceil((temp * 1.8) + 32);
    }

}
