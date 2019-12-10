
public class Demo3 extends Thread
{
    public void run(){
        for(int i=0;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException
             ie){System.out.println(ie);}
            System.out.println(i);
        }
    }
	public static void main(String[] args) {
	    
		Demo3 t1 = new Demo3();
		Demo3 t2 = new Demo3();
		Demo3 t3 = new Demo3();
		t1.start();
		try{
		t1.join();
		}catch(InterruptedException ie){System.out.println(ie);}
		t2.start();
		t3.start();
		
	}
}
