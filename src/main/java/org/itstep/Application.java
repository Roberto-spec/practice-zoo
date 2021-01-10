package org.itstep;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Zoo app");
        Zoo zoo=new Zoo();
        Input input=new Input();
        Scanner scanner=new Scanner(System.in);
        int a=0;
        do{
            zoo.addAnimal(input.input_animal());
            System.out.println("Добавить еще животных?([1]ДА)");
            a=scanner.nextInt();
        }while (a==1);

        do{

            System.out.println("Меню");
            System.out.println("[1] Добавление нового животного в зоопарк");
            System.out.println("[2] Отображение всех животных");
            System.out.println("[3] Удаление животного по кличке");
            System.out.println("[4] Подсчет расходов для всех животных за текущий день");
            System.out.println("[5] Подсчет расходов для всех животных за весь период учета");
            System.out.println("[6] Выход");
            a=scanner.nextInt();
            switch (a){
                case 1:{
                    zoo.addAnimal(input.input_animal());
                    break;
                }
                case 2:{
                    System.out.print(zoo.toString());
                    break;
                }
                case 3:{
                    zoo.deleteAnimal(input.input_name());
                    break;
                }
                case 4:{
                    System.out.println("Расходы за денб:"+zoo.getMoney_per_day());
                    break;
                }
                case 5:{
                    System.out.println("Расходы за за весь период учета:"+zoo.getMoney_all_time());
                    break;
                }
                default: break;
            }

        }while (a!=6);

    }
}
