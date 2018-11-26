package abu.com.thread;

import static java.lang.Thread.sleep;

public class ThreadDemo {

	private int STATE;
	private int VALUE = 0;

	public static void main(String[] args) throws InterruptedException{
		ThreadDemo th = new ThreadDemo();
		th.Start();
	}
	void Start() throws InterruptedException {
		Read read = new Read();
		Write write = new Write();
		while(true){
			sleep(1000);
			read.run();
			write.run();
		}
	}

	class Read implements Runnable{
		public void run(){
			while(true){
				if(STATE == 0){
					System.out.println(VALUE);
					STATE = 1;
					break;
				}
			}
		}
	}

	class Write implements Runnable{
		public void run(){
			while(true){
				if(STATE == 1){
					VALUE += 1;
					System.out.println(VALUE);
					STATE = 0;
					break;
				}
			}
		}
	}
}

