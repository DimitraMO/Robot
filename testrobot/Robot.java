package testrobot;

public class Robot {

    String name;
    String genter;
    String nativeLanguage;
    //int creationDate;

    public Robot(String name, String genter, String nativeLanguage) {
        this.name = name;
        this.genter = genter;
        this.nativeLanguage = nativeLanguage;
        //this.creationDate = creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    /*public void setAge(int age) {
        this.creationDate = age;
    }*/
    public String getName() {
        return name;
    }

    public String getGenter() {
        return genter;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    /* public int getAge() {
        return creationDate;
    }*/
    public String speak() {
        return "Hello there, my name is " + name + ". I am here to make things better for you... So let's get our hands dirty and collet some items by their color!";
    }

    public void listen() {
        System.out.println("...listening...");
    }

    public void walk() {
        System.out.println("...walking...");
    }

    public void turnRight() {
        System.out.println("...turning right...");
    }

    public void turnLeft() {
        System.out.println("...turning left...");

    }

    @Override
    public String toString() {
        return "Robot's information: \nName: " + name + "\nNative language: " + nativeLanguage + "\nGenter: " + genter;
    }
}
