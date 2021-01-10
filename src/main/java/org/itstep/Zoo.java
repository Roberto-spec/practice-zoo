package org.itstep;

import java.time.LocalDate;
import java.util.Arrays;

public class Zoo {
    private LocalDate current_date=LocalDate.now();
    private int money_per_day;
    private int money_all_time;
    private Animal[] animals;
    Zoo(){
        animals=new Animal[0];
        money_all_time=0;
        money_per_day=0;
    }



    public void next_day_zoo(){
        current_date.plusDays(1);
        money_per_day=0;
        for(int i=0;i<animals.length;i++){
            animals[i].next_day();
            money_all_time+=animals[i].getMoney_per_day();
            money_per_day+=animals[i].getMoney_per_day();
        }

    }
    public void addAnimal(Animal animal) {
        this.animals = Arrays.copyOf(this.animals, this.animals.length + 1);
        this.animals[this.animals.length - 1] = animal;
        money_per_day+=animals[animals.length-1].getMoney_per_day();
        money_all_time+=animals[animals.length-1].getMoney_all_time();
    }
    public void deleteAnimal(String name) {

        int i=-1;
        for(int j=0;j<animals.length;j++){
            if(animals[j].getName()==name)i=j;

        }
        if(i==-1) System.out.println("В зоопарке нет такой клички");
        else{
            Animal[] animal=Arrays.copyOf(this.animals, this.animals.length - 1);
            int y=0;
            money_per_day-=animals[i].getMoney_per_day();
            for(int j=0;j<animals.length;j++){
                if(i!=j) {
                    animal[y]=animals[j];
                    y++;
                }

            }
            animals=animal;
        }
    }

    public int getMoney_all_time() {
        return money_all_time;
    }

    public int getMoney_per_day() {
        return money_per_day;
    }

    @Override
    public String toString() {
        String s="Зоопарк "+current_date.toString()+"\n";
        s+="Расходы за день:"+money_per_day+"\n";
        s+="Расходы за все время:"+money_all_time+"\n";
        s+="Список животных"+"\n";
        for(int j=0;j<animals.length;j++){
            s+=animals[j].toString();
        }

        return s;
    }
}
