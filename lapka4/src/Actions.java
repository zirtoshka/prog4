
public enum Actions {

    GETUP("залез на"),
    FALL("падает на"),
    MOVE("перемещается к"),
    JUMPDOWN("спрыгивает на"),
    HEADED("отправились в"),
    DISAPPEARED("скрыться вдали"),//hhhhh
    STUCK_OUT_SILENTLY("безмолвно торчали над"),//hhhhhh
    ONLY_SNUFFLED("только посапывали носами"),//hhhhh
    GOT_OVER_FENCE_AFTER("перелез через забор вслед за"),
    TRIED_TO_OPEN("попытался открыть дверь");//hhhh

    private String action;

    Actions(String action) {
        this.action = action;
    }

    public String getActions() {
        return action;
    }

    @Override
    public String toString() {
        return this.toString();
    }

}
