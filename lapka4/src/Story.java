
public class Story {

    public static void main(String[] args) {

        class Cosmonauts extends HumanGroup {
            public void quitAndMove() {
                System.out.print("Выйдя из ангара и закрыв дверь на ключ, ");
                moveTo(Place.COSMOS_TOWN, Actions.HEADED);
            }

            public Cosmonauts() {
                super("космонавты", Place.HANGAR);
            }
        }

        Cosmonauts cosmonauts = new Cosmonauts();

        Human julio = new Human("Жулио", Place.GROUND);
        SloppyHuman spruts = new SloppyHuman("Спрутс", Place.GROUND) {
            //an
            @Override
            public void recoverFromFall() {
                moveTo(julio, Actions.GOT_OVER_FENCE_AFTER);
                moveTo(Place.HANGAR, Actions.TRIED_TO_OPEN);
            }
        };
        AnonymousHumanGroup.Head julioHead = new AnonymousHumanGroup.Head(julio);
        AnonymousHumanGroup.Head sprutsHead = new AnonymousHumanGroup.Head(spruts);
        AnonymousHumanGroup twoHeads = new AnonymousHumanGroup(
                "две головы в чёрных масках", Place.FENCE, julioHead, sprutsHead
        );


        Box box = new Box("ящик", Place.GROUND, true);

        cosmonauts.quitAndMove();

        try {
            cosmonauts.didNotYet(Actions.DISAPPEARED);
        } catch (InterruptedException e) {
            twoHeads.leanOut();
        }

        twoHeads.beIdle(Actions.STUCK_OUT_SILENTLY, Actions.ONLY_SNUFFLED);

        julioHead.say("??????");
        twoHeads.reveal();

        julio.setStatus(Status.WAIT);
        julio.setStatus(Status.CHECKING);
        julio.said("мурмур");

        spruts.setStatus(Status.GROAN);
        spruts.moveTo(Place.FENCE, Actions.GETUP);
        spruts.moveTo(Place.GROUND, Actions.JUMPDOWN);

        julio.rise(box);
        julio.transferred(box, spruts);

        spruts.setStatus(Status.HANDSUP);
        spruts.setStatus(Status.TRY);

        spruts.tryKeep(box);
    }
}
