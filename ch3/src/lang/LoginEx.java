package lang;

public class LoginEx {
    public static void main(String[] args) throws Exception {
        try {
            login("white", "12345");
            // login("blue", "54321");
            login("blue", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        // id가 blue가 아니라면 NotExistIDException 발생
        if (id != "blue")
            throw new NotExistIDException("ID가 blue가 아닙니다.");

        if (password != "12345")
            throw new WrongPasswordException("Password가 다릅니다.");
        // password가 "12345"가 아니라면 WrongPasswordException 발생

        System.out.println("로그인 완료");
    }
}
