

public class Box extends Entity {

    private final boolean flag;

    public Box(String name, Place place, boolean flag) {
        super(name, place);
        this.flag = flag; //тяжелый ли ящик

    }


    @Override
    public String toString() {
        return "name: " + this.getName() + "place: " + this.getPlace() + "flag: " + flag;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Box check = (Box) o;
        return hashCode() == check.hashCode();
    }


}
