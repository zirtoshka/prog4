public enum Status {
    WAIT("ждет"),
    CHECKING("ищет людей вокруг"),
    GROAN("кряхтит"),
    HANDSUP("поднимает руки"),
    RISE("поднял"),
    SAID("сказал"),
    TRANSFERRED("стал подавать"),
    TRY("старается подхватить"),
    BEABLE("смог удержать"),
    NOTBEABLE("не смог удержать"),

    DEFAULT("");


    private String replic;

    Status(String status) {
        this.replic = status;
    }

    public String getPhrase() {
        return replic;

    }

}
