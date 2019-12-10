class Hai extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            try{Thread.sleep(500);}catch(InterruptedException ie){System.out.println(ie);}
            System.out.println(i);
        }
        
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            try{Thread.sleep(500);}catch(InterruptedException ie){System.out.println(ie);}
            System.out.println(i);
        }
        
    }
}
public class Demo2
{
	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.start();
		
		
		Thread t1 = new Thread(new Hello());
		t1.start();
	}
}
