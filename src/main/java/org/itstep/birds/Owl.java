package org.itstep.birds;

import org.itstep.Animal;

import java.time.LocalDate;

public class Owl extends Animal {
    public static final String type="Сова";

    public Owl(String name, LocalDate birthday, int weight, int aviary, LocalDate arrival, int money_per_day, int money_all_time, String sex) {
        super(name, birthday, weight, aviary, arrival, money_per_day, money_all_time, sex);
    }
    @Override
    public String toString() {
        String s="";
        s+=type+": "+getName()+" Вольер №"+getAviary()+"Пол:"+getSex()+"Вес: "+getWeight()+"\n";
        s+="Дата рождения:"+getBirthday().toString()+"\n";
        s+="Дата прибытия:"+getArrival().toString()+"\n";
        s+="Расходы за день:"+getMoney_per_day()+"\n";
        s+="Расходы за все время:"+getMoney_all_time()+"\n";
        return s;
    }
}
