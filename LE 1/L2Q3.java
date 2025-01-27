
class Mother {
    void show(){
        System.out.println("Hello world");
    }
};
class Child extends Mother {
    void show(){
        System.out.println("Hello Juet");
    }
    
    }
class Application {
 public static void main (String args[]){
 Mother m= new Mother ( );
 Mother m1=new Child ();
 
 m.show( ); 
 Child ch=new Child ( ); 
 ch. show ( );
 ((Mother) m1).show();
 }
}