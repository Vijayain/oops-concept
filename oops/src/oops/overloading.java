package oops;

public class overloading {
	void show() {
		System.out.println("nothing to show");
		
	}
	void show(int a) {
		System.out.println("showing an integer "+a);
		
	}
	void show(int c ,int d) {
		System.out.println("showing two integers "+ c +"and"+d);
		
	}
	void show(String name) {
		System.out.println("showing a string "+name);
		
	}
	
		


public static void main(String args[]) {
	overloading over=new overloading();
	over.show();

	over.show(10);
	
	over.show(20,3);
	
	over.show("vijayain");
	
	over.show('b');
	System.out.println("char b is promoted to int and its a example of automatic promotion"
			+ "");
	
}
}

