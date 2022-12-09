public class FallException extends RuntimeException {
    public FallException(SloppyHuman human) {
        human.recoverFromFall();
    }
}
