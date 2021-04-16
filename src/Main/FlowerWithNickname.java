package Main;

public class FlowerWithNickname extends Flower {
    private String nickname;

    FlowerWithNickname() {
    }

    public FlowerWithNickname(final String name, final String nickname, final char initialLetter, final double price, final int recommendedTemperature, final boolean hasLight, final int waterUse, final boolean isAlive) {
        super(name, initialLetter, price, recommendedTemperature, hasLight, waterUse, isAlive);
        this.nickname = nickname;
    }

    public String getNickname() {
        spitznameCheck();
        return nickname;
    }

    public void spitznameCheck() {
        if (nickname == null) {
            this.nickname = "-";
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Nickname: " + nickname);
        super.printInfo();
    }

    @Override
    protected String isSellable() {
        return "Yes";
    }
}
