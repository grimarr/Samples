package com.javarush.test.level05.lesson05.task03;

/* ������� � ������� ��� ������ Dog
������� class Dog. � ������ ������ ���� ������ String name � ������� int age.
�������� ������� � ������� ��� ���� ���������� ������ Dog.
*/

public class Dog {
	protected String name;
	protected int age;
	
    public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	public String getName() { return name; }
	public int getAge() { return age; }
}
