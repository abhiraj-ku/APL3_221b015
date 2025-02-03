class Pandav extends Bharatvanshi{
    public String name;
    public String kindnessLevel;
    
    public Pandav(String name,String kindnessLevel){
        this.name = name;
        this.kindnessLevel = kindnessLevel;
    }
    
    @Override 
    public void fight(){
        System.out.println(name + " Fights bravely");
    }
    
     public void obey(){
        System.out.println(name + " is obedient");
        
    }
    
    public void kind(){
        System.out.println(name + " is kind with kindnessLevel of " + kindnessLevel);
    }
    
    
}