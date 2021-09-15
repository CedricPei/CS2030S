public class RubikUp extends RubikFront {

    /**
     * this method is used to create a Rubik.
     */
    public RubikUp(Rubik rubik) {
        super(rubik.toIntArray());
    }

    @Override
    /**
     * this method is used to turn the Rubik left.
     */
    public RubikFront left() {
        return super.upView().left().downView();
    }

    @Override
    /**
     * this method is used to turn the Rubik right.
     */
    public RubikFront right() {
        return super.upView().right().downView();
    }

    @Override
    /**
     * this method is used to turn the Rubik half.
     */
    public RubikFront half() {
        return super.upView().half().downView();
    }
        
}
