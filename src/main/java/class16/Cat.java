package class16;

public class Cat {

    private String color;
    private int age;
    private String name;
    private String size;
    private char gender;
    private String spayedOrNeutered;

    public Cat(String color, int age,String name,String size, char gender, String spayedOrNeutered){
       // this.color=color;
       // this.age=age;
       // this.name=name;
       // this("White",5,"Miky");
        this(color,age,name);
        this.size=size;
        this.gender=gender;
        this.spayedOrNeutered=spayedOrNeutered;

    }
    public Cat(String color,  int age,String name){
        //this.color=color;
       // this.age=age;
        this(color,age);
        this.name=name;
    }
    public Cat(String color,int age){
        this.color=color;
        this.age=age;

    }
    public void displayInfo(){
        System.out.println("Name of the Cat is "+name);
    }
    }




