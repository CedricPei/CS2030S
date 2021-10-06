public abstract class Question{

    public abstract Question answer(int ans);

    public MarkInterface lock() {
        MarkInterface markInterface = (MarkInterface)this;
        return markInterface;
    }
}
