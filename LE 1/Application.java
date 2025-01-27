class Mother {
	void show() {
		System.out.println("inherited");
	}
}
class Child extends Mother {
}
class Application {
	public static void main (String args[]) {
		Mother m= new Mother ( );
		m.show( );
		Child ch=new Child ( );
		ch. show ( );
	}
}
