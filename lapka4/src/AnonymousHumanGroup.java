import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnonymousHumanGroup extends HumanGroup {
    //static nested class
    public static class Head {
        private Human owner;

        public Human getOwner() {
            return owner;
        }

        public Head(Human owner) {
            this.owner = owner;
        }

        public void say(String what) {
            System.out.println("Наконец, одна голова сказала голосом " + owner.getName() + ": " + what);
        }
    }

    private Head[] heads;

    public void reveal() {
        String who = Stream.of(heads)
                .map(Head::getOwner)
                .map(Human::getName)
                .collect(Collectors.joining(" и "));

        System.out.println("Это на самом деле были " + who);
    }

    public void leanOut() {
        System.out.println("из-за " + getPlace().getPhrase() + " высунулись " + getName());
    }

    public void beIdle(Actions idleAction, Actions additionalAction) {
        System.out.println(
                "Некоторое время они " + idleAction.getActions() + " " + place.getPhrase()
                + " и " + additionalAction.getActions()
        );
    }

    public AnonymousHumanGroup(String name, Place place, Head... heads) {
        super(name, place);
        this.heads = heads;
    }
}
