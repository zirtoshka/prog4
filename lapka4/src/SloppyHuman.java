public abstract class SloppyHuman extends Human implements ISloppy {
    public SloppyHuman(String name, Place place) {
        super(name, place);
        this.strong = false;
    }

    @Override
    public void tryKeep(Box box) {
        super.tryKeep(box);
        throw new FallException(this);
    }
}
