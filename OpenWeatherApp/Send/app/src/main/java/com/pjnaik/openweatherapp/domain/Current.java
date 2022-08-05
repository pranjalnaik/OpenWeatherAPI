package com.pjnaik.openweatherapp.domain;

public class Current {
    private String dateTime;
    private String temp;
    private String feelsLike;
    private String winds;
    private String humidity;
    private String uvi;
    private String visibility;
    private String sunrise;
    private String sunset;
    private String windSpeed;
    private String weatherDesc;
    private String weatherIcon;

    public Current(String dateTime, String temp, String feelsLike, String winds, String humidity, String uvi, String visibility, String sunrise, String sunset, String windSpeed, String weatherDesc, String weatherIcon) {
        this.dateTime = dateTime;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.winds = winds;
        this.humidity = humidity;
        this.uvi = uvi;
        this.visibility = visibility;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.windSpeed = windSpeed;
        this.weatherDesc = weatherDesc;
        this.weatherIcon = weatherIcon;
    }

    public String getWinds() {
        return winds;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getTemp() {
        return temp;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getUvi() {
        return uvi;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    @Override
    public String toString() {
        return "Current{" +
                "dateTime='" + dateTime + '\'' +
                ", temp='" + temp + '\'' +
                ", feelsLike='" + feelsLike + '\'' +
                ", humidity='" + humidity + '\'' +
                ", uvi='" + uvi + '\'' +
                ", visibility='" + visibility + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", weatherDesc='" + weatherDesc + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                '}';
    }
}
