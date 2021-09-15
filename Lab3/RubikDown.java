public class RubikDown extends RubikFront {

    /**
     * this method is used to create a Rubik.
     */
    public RubikDown(Rubik rubik) {
        super(rubik.toIntArray());
    }

    @Override
    /**
     * this method is used to turn the Rubik left.
     */
    public RubikFront left() {
        return super.downView().left().upView();
    }

    @Override
    /**
     * this method is used to turn the Rubik right.
     */
    public RubikFront right() {
        return super.downView().right().upView();
    }

    @Override
    /**
     * this method is used to turn the Rubik half.
     */
    public RubikFront half() {
        return super.downView().half().upView();
    }
        
}
