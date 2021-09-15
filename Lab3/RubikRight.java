public class RubikRight extends RubikFront {

    /**
     * this method is used to create a Rubik.
     */
    public RubikRight(Rubik rubik) {
        super(rubik.toIntArray());
    }

    @Override
    /**
     * this method is used to turn the Rubik left.
     */
    public RubikFront left() {
        return super.rightView().left().leftView();
    }

    @Override
    /**
     * this method is used to turn the Rubik right.
     */
    public RubikFront right() {
        return super.rightView().right().leftView();
    }

    @Override
    /**
     * this method is used to turn the Rubik half.
     */
    public RubikFront half() {
        return super.rightView().half().leftView();
    }
        
}
