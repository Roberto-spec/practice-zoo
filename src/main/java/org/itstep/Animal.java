package org.itstep;

import java.time.LocalDate;


public abstract class Animal {

    private String name;
    private LocalDate birthday;
    private int weight;
    private int aviary;
    private LocalDate arrival;
    private int money_per_day;
    private int money_all_time;
    private String sex;



    public Animal(String name, LocalDate birthday, int weight, int aviary, LocalDate arrival, int money_per_day, int money_all_time, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.aviary = aviary;
        this.arrival = arrival;
        this.money_per_day = money_per_day;
        this.money_all_time = money_all_time;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAviary() {
        return aviary;
    }

    public void setAviary(int aviary) {
        this.aviary = aviary;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public int getMoney_per_day() {
        return money_per_day;
    }

    public void setMoney_per_day(int money_per_day) {
        this.money_per_day = money_per_day;
    }

    public int getMoney_all_time() {
        return money_all_time;
    }

    public void setMoney_all_time(int money_all_time) {
        this.money_all_time = money_all_time;
    }

    public void next_day(){
        money_all_time+=money_per_day;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}


