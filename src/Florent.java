public class Florent {
    private static Florent emperor = new Florent();

    public static Florent getInstance() {
        return emperor;
    }

    private Florent() {
    }
}
