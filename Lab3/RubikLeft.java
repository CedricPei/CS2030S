public class RubikLeft extends RubikFront {

    /**
     * this method is used to create a Rubik.
     */
    public RubikLeft(Rubik rubik) {
        super(rubik.toIntArray());
    }

    @Override
    /**
     * this method is used to turn the Rubik left.
     */
    public RubikFront left() {
        return super.leftView().left().rightView();
    }

    @Override
    /**
     * this method is used to turn the Rubik right.
     */
    public RubikFront right() {
        return super.leftView().right().rightView();
    }

    @Override
    /**
     * this method is used to turn the Rubik half.
     */
    public RubikFront half() {
        return super.leftView().half().rightView();
    }
        
}
