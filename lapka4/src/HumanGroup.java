public class HumanGroup extends Human {

    public void didNotYet(Actions firstAction) throws InterruptedException {
        System.out.print("Не успели они " + firstAction.getActions() + ", как ");

        throw new InterruptedException();
    }

    public HumanGroup(String name, Place place) {
        super(name, place);
    }
}
