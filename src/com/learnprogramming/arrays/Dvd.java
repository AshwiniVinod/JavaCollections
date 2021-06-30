package com.learnprogramming.arrays;

public class Dvd {
    private String Name;
    private Integer date;
    private String Director;

    public Dvd(String name, Integer date, String director) {
        Name = name;
        this.date = date;
        Director = director;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "Name='" + Name + '\'' +
                ", date=" + date +
                ", Director='" + Director + '\'' +
                '}';
    }
}
