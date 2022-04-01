package lesson4;

public class Animal {

    private String name;



    public Animal(String name){
        this.name = name;
    }


    public Animal(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){

        System.out.println(". .. ... ....");
    }
}
