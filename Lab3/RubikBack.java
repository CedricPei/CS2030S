public class RubikBack extends RubikFront {

    /**
     * this method is used to create a Rubik.
     */
    public RubikBack(Rubik rubik) {
        super(rubik.toIntArray());
    }

    @Override
    /**
     * this method is used to turn the Rubik left.
     */
    public RubikFront left() {
        return super.backView().left().backView();
    }

    @Override
    /**
     * this method is used to turn the Rubik right.
     */
    public RubikFront right() {
        return super.backView().right().backView();
    }

    @Override
    /**
     * this method is used to turn the Rubik half.
     */
    public RubikFront half() {
        return super.backView().half().backView();
    }
        
}
