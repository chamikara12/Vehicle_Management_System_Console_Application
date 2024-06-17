package vehicle.park.management.system;

/**
 * Create by Chamikara Madushanka
 * 2024/06/06
 */
public class Person {

    //Create private field

    private String name;
    private char sex;
    private int age;

    //Create public Constructor foe initialized field

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(
            String name,
            char sex,
            int age
    ){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    Person(){}
    //Create getters for sex and age
    public String getName(){
        return name;
    }
    public char getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    //Create public methode for display details of person

    public String details(){
        return "Name: "+name+"\nSex:"+sex+" \nAge:"+age;
    }
}
