package com.javarush.test.level13.lesson02.task01;

/* Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс и реализуйте все нереализованные методы.
3. Подумай, как связаны переменная  READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Drink beer = new Beer();
        beer.askMore("Moore");

    }

    public interface Drink
    {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink
    {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol
    {
        int count;
        public void askMore(String message){
            count++;
            System.out.println(message +" ? it's " + count);
        }
        public boolean isReadyToGoHome(){
            if (READY_TO_GO_HOME)
            {
                System.out.println("ready"); return true;
            }
            else {System.out.println("ready"); return false;}
        }
        public void sayThankYou(){
            System.out.println("thx");
        }
        public void sleepOnTheFloor(){

        }

    }
}
