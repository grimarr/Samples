package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    private String name;
    private int age;
    private int weight;
    private int strength;
	public static int counter;
	
    public Cat(String name, int age, int weight, int strength) {
		counter++;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.strength = strength;
    }
	public Cat() {
	}
	
	public String getName()	{return name;}
	public int getAge()	{return age;}
	public int getWeight()	{return weight;}
    public int getStrength() {return strength;}
	public void setName(String name) {this.name = name;}
	public void  setAge(int age) {this.age = age;}
	public void setWeight(int weight) {this.weight = weight;}
	public void setStrength(int strength) {this.strength = strength;}

    public boolean fight(Cat anotherCat)
    {

     /*  if ((this.age < anotherCat.age)  && (this.weight > anotherCat.weight) || (this.strength > anotherCat.strength))
        return true;
        else
            return false;
    */
         return ((this.age < anotherCat.age) && (this.weight > anotherCat.weight) || (this.strength > anotherCat.strength));
		
		/*  Еще один вариант
		
			int agePlus = this.age > anotherCat.age ? 1 : 0;         // тернарный оператор if ? then : else
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
		*/
    }
}
