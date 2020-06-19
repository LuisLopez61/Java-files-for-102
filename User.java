public class User {
    //atributes: name and age
    public String name;
    private int age;

    //methods
    //Constructor
    public User(String name, int age){
        this.name=name;
        setAge(age);
    }

    public void setAge(int age){
        if(age<100){
            this.age=age;
            System.out.println("the age was assigned");
        }
        else{
            System.out.println("error *** the age is not correct");
        }
    }

    public void printUser(){
        System.out.println("---New User---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " +this.age);
        
    }
}