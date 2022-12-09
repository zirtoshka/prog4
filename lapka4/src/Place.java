public enum Place {
    GROUND("земля"),
    FENCE("забор"),
    COSMOS_TOWN("Космический городок"),
    HANGAR("ангар");

    private String place;

    Place(String place) {
        this.place = place;
    }

    public String getPhrase() {
        return place;
    }
}
