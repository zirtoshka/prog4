

public class Human extends Entity {

    private Status status;
    protected boolean strong;

    public Human(String name, Place place) {
        super(name, place);
        this.strong = true;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println(getName() + " " + this.status.getPhrase());
    }

    public void setStatusQuiet(Status status) {
        this.status = status;
    }

    public void said(String mes) {
        this.setStatusQuiet(Status.SAID);
        System.out.println(getName() + " " + this.status.getPhrase() + " " + mes);
    }

    public void rise(Box box) {

        this.setStatusQuiet(Status.RISE);
        System.out.println(getName() + " " + this.status.getPhrase() + " " + box.getName() + " c " + box.getPlace().getPhrase());

    }


    public void transferred(Box box, Human human) {
        this.setStatusQuiet(Status.TRANSFERRED);
        System.out.println(getName() + " " + getStatus().getPhrase() + " " + box.getName() + " " + human.getName());
    }

    public void tryKeep(Box box) {

        if (!strong) {
            System.out.println(box.getName() + " очень тяжелый");
            setStatusQuiet(Status.NOTBEABLE);
            System.out.println(getName() + " " + getStatus().getPhrase() + " " + box.getName());
            box.moveTo(Place.GROUND, Actions.FALL);
            moveTo(Place.GROUND, Actions.FALL);

        } else {
            System.out.println(box.getName() + " легкий");
            setStatusQuiet(Status.BEABLE);
            System.out.println(getName() + " " + getStatus().getPhrase() + " " + box.getName());
            box.moveTo(this, Actions.MOVE);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Human check = (Human) o;
        return hashCode() == check.hashCode();
    }


}

