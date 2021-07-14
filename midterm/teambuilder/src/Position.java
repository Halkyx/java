public enum Position {
    GK("Goal Keeper"),
    DF("Defender"),
    MF("Mid Fielder"),
    FW("Foward");

    private String position;

    Position(String position) {
        this.position = position;
    }

    String getValue() {
        return position;
    }
}