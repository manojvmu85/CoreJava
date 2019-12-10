class Hai extends Thread{
    public void run(){
        System.out.println("Hai Thead is running...");
    }
}
class Hello implements Runnable{
    public void run(){
        System.out.println("Hello Thead is running...");
    }
}
public class Demo1
{
	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.start();
		hai.setName("Hai");
		System.out.println(hai.getId());
		System.out.println(hai.getName());
		System.out.println(hai.currentThread());
		
		Thread t1 = new Thread(new Hello());
		t1.start();
	}
}
