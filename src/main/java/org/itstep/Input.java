package org.itstep;




import org.itstep.birds.Eagle;
import org.itstep.birds.Owl;
import org.itstep.cats.Lion;
import org.itstep.cats.Tiger;
import org.itstep.dogs.Dog;
import org.itstep.dogs.Wolf;

import java.time.LocalDate;
import java.util.Scanner;

public class Input {
    private Scanner scanner_int=new Scanner(System.in);
    private Scanner scanner_line=new Scanner(System.in);


    public Animal input_animal(){
        Animal a;
    int i=input_types_of_animals();
    switch (i){
        case 2:{
            a=new Owl(input_name(),input_birthday(),input_weight(),input_aviary(),input_arrival(),input_money_per_day(),input_money_all_time(),input_sex());
            return a;
        }
        case 3:{
            a=new Lion(input_name(),input_birthday(),input_weight(),input_aviary(),input_arrival(),input_money_per_day(),input_money_all_time(),input_sex());
            return a;
        }
        case 4:{
            a=new Tiger(input_name(),input_birthday(),input_weight(),input_aviary(),input_arrival(),input_money_per_day(),input_money_all_time(),input_sex());
            return a;
        }
        case 5:{
            a=new Dog(input_name(),input_birthday(),input_weight(),input_aviary(),input_arrival(),input_money_per_day(),input_money_all_time(),input_sex());
            return a;
        }
        case 6:{
            a=new Wolf(input_name(),input_birthday(),input_weight(),input_aviary(),input_arrival(),input_money_per_day(),input_money_all_time(),input_sex());
            return a;
        }

    }
    Eagle e=new Eagle(input_name(),input_birthday(),input_weight(),input_aviary(),input_arrival(),input_money_per_day(),input_money_all_time(),input_sex());
        return e;

    }
    public String input_name(){
        String s="";
        do {
            System.out.print("Введите кличку животного: ");
            s = scanner_line.nextLine();
        }while(s.length()<2);
        return s;
    }
    public String input_sex(){
        int s=1;
        do {
            System.out.print("Пол ([1]Самка [2]Самец): ");
            s = scanner_int.nextInt();
        }while(s!=2&&s!=1);
        if(s==2) return "Самец";

        return "Самка";
    }
    public int input_weight(){
        int s=0;
        do {
            System.out.print("Введите вес животного: ");
            s = scanner_int.nextInt();
        }while(s<1);
        return s;
    }
    public int input_aviary(){
        int s=0;
        do {
            System.out.print("Введите номер вальера животного: ");
            s = scanner_int.nextInt();
        }while(s<1);
        return s;
    }
    public int input_money_per_day(){
        int s=0;
        do {
            System.out.print("Введите расходы в день на животного: ");
            s = scanner_int.nextInt();
        }while(s<1);
        return s;
    }
    public int input_money_all_time(){
        int s=0;
        do {
            System.out.print("Введите расходы за все время на животного: ");
            s = scanner_int.nextInt();
        }while(s<0);
        return s;
    }
    public LocalDate input_birthday(){
        System.out.println("Введите дату рождение животного:");
        return input_date();
    }
    public LocalDate input_arrival(){
        System.out.println("Введите дату прибывание в зоопарк животного:");
        return input_date();
    }
    public LocalDate input_date(){
        int day=0;
        int month=0;
        int year=0;

        do {
            System.out.print("Введите день: ");
            day=scanner_int.nextInt();
            System.out.print("Введите месяц: ");
            month=scanner_int.nextInt();
            System.out.print("Введите год: ");
            year=scanner_int.nextInt();

        }while(day<1||month<1||year<1800||year> LocalDate.now().getYear()||day>31||month>12||year>2022);

        return LocalDate.of(year,month,day);
    }
    public int input_types_of_animals(){
        Types_of_animals t=new Types_of_animals();
        int i=1;
        System.out.print(t.toString());
        do {
            System.out.print("Введите вид животного:");
            i=scanner_int.nextInt();
        }while (i<1&&i>t.getTypes_of_animals_lenght());
        return i;

    }


}
