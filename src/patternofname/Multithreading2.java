package patternofname;

public class Multithreading2 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		System.out.println("the name of the thread:"+name);//main
		
		int p=t.getPriority();
		System.out.println("default priority of main thread is:" +p);//5
		
		t.setName("vaishu");
		t.setPriority(9);
		String n1=t.getName();
		int p1=t.getPriority();
		System.out.println("name is changed:"+n1);
		System.out.println("priority id changed:"+p1);

	}

}
