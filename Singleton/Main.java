package Singleton;
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("instance 1");
        Singleton anotherSingleton = Singleton.getInstance("instance 2");
        // boi vi instance chi khoi tao 1 lan 
        // => value se chi lay gia tri khi khoi tao instance dau tien
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
