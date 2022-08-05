package com.pjnaik.openweatherapp.domain;

public class Hourly {
    private String dayName;
    private String time;
    private String icon;
    private String temp;
    private String desc;

    public Hourly(String dayName, String time, String icon, String temp, String desc) {
        this.dayName = dayName;
        this.time = time;
        this.icon = icon;
        this.temp = temp;
        this.desc = desc;
    }

    public String getDayName() {
        return dayName;
    }

    public String getTime() {
        return time;
    }

    public String getIcon() {
        return icon;
    }

    public String getTemp() {
        return temp;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "dayName='" + dayName + '\'' +
                ", time='" + time + '\'' +
                ", icon='" + icon + '\'' +
                ", temp='" + temp + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
