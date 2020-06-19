public class Example {
    
    public static void main(String args[]){

        User Luis = new User( "Luis" , 33);

        System.out.println(Luis.name);
        Luis.printUser();
    
        //add another object of type;

        User pat = new User( "pat" , 22 );
        
        System.out.println(pat.name);
        pat.printUser();

        Student charels = new Student("charels",28,10);
        charels.printStudent();
    
    
         Student kenny = new Student("kenny",33,10);
            kenny.printStudent();



            Animal baby = new Animal("baby ", "cow");
            baby.printAnimal();
        

            //add another object of the type animal

            Animal adult = new Animal("Adult", "cat");
            adult.printAnimal();
        

            baby.attacks(kenny);
            
            //add another attack

            adult.attacks(pat);

            
        }


}