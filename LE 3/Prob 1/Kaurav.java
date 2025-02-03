class Kaurav extends Bharatvanshi{
    public String name;
    
    public Kaurav(String name){
        this.name= name;
    }
    
      @Override 
    public void fight(){
        System.out.println(name + " Fights cruely");
    }
    
     public void disobey(){
        System.out.println(name + " is disobedient");
        
    }
}