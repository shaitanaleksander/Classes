package lesson4;

public class Lion extends Animal {

    private String name = "Simba";

    private   int age = 1 +1;


    public Lion (){
        name = "Abby";
    }

    public Lion (String name){
        this.name = name;
    }


    public Lion (int age){
        this.age = age;
    }
    public Lion (short age){
        this.age = age;
    }
    public Lion (byte age){
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("arrr");
    }


    public void makeSound(String sound){
        System.out.println(sound);
    }

   public void makeSound(String sound, Integer i){

    }

   public void makeSound(Integer i, String sound){

    }




}
