package java21;

public class 期末 {
	     public static void main(String[] args){
	    	 MyThread t1 = new MyThread("线程1");
	    	 MyThread t2 = new MyThread("线程2");
	    	 t1.start();
	    	 t2.start();
	    	 }
	}
	class MyThread extends Thread{
		public MyThread(String name){
			super(name);
		}
		public void run(){
			for(int i=1;i<=5;i++){
				System.out.printf("%s执行第%d次\n",this.getName(),i);
				try{
					sleep(800);
				}catch (InterruptedException e){
					
				}
			}
		}
	}