package Exercicios1e2;

public abstract class Mamifero extends Animal{
    
    public Mamifero(String n,int p) {
        super(n);
        setPatas(p);
    }
    
    private int patas;
    
    public int getPatas(){
        return this.patas;
    } 
    public void setPatas(int p){
        this.patas=p;
    } 
    
   public abstract void talk();
    
    
}
