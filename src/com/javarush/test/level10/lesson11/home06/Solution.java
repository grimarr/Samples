package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human {
        private String name;
        private Boolean sex;
        private int age;
        private String work;
        private String study;
        private String date;

        public Human() {

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, Boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String work, String study) {
            this.work = work;
            this.study = study;
        }

        public Human(String name, String study, String work) {
            this.name = name;
            this.study = study;
            this.work = work;
        }

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, String date){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.date = date;
        }

        public Human(String name, int age, String study, String work){
            this.name = name;
            this.age = age;
            this.study = study;
            this.work = work;
        }

        public Human(String name, Boolean sex, int age, String study, String work){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.study = study;
            this.work = work;
        }

        public Human(String name, Boolean sex, int age, String study, String work, String date){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.study = study;
            this.work = work;
            this.date = date;
        }

    }
}
