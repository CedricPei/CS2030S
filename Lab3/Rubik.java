public abstract class Rubik implements Cloneable {

    abstract Rubik left();
    
    abstract Rubik right();
        
    abstract Rubik half();

    abstract int[][][] toIntArray();
    
    abstract Rubik rightView();

    abstract Rubik leftView();
    
    abstract Rubik upView();
 
    abstract Rubik downView();

    abstract Rubik backView();

    abstract Rubik frontView();

    @Override
    public abstract Rubik clone();
}











