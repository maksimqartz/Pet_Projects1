package Example_2;

public class Main {

    private static final String EXISTED_USER = "existed";
    private static final String NOT_EXISTED_USER = "wrong";

    public static void main(String[] args) {
        Main instance = new Main();
        instance.loginAs(EXISTED_USER, "");
    }

    private boolean loginAs(String login, String password) {
        boolean isSuccess;

        switch (login) {
            case EXISTED_USER:
                isSuccess = true;
                break;

            case NOT_EXISTED_USER:
            default:
                isSuccess = false;
                break;
        }

        return isSuccess;
    }
}
