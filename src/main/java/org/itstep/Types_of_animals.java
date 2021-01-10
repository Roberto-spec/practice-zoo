package org.itstep;

import java.util.Arrays;

public class Types_of_animals {
    private String[] types_of_animals;

    public Types_of_animals() {
        this.types_of_animals = new String[]{"Орел","Сова","Лев","Тигр","Собака","Волк"};
    }

    public String getTypes_of_animals(int idx) {
        return types_of_animals[idx];
    }
    public int getTypes_of_animals_lenght() {
        return types_of_animals.length;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<types_of_animals.length;i++){
            s+="["+i+"] "+types_of_animals[i]+"\n";
        }
        return s;
    }
}
