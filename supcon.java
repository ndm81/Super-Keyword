class Animal{  // Main class
       Animal() //Constructor of the Animal class
        {
           System.out.println("This is the Animal");
       }
}

 class Dog extends Animal{
 	   Dog(){
 	   	super();
 	   	System.out.println("This is the Dog");
 	   }
 }
     class Test{
     	public static void main(String[] args) {
     		Dog g=new Dog();
     	}
     }