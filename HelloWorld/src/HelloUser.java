/**
 * Created by ffittschen on 24/10/2016.
 */
public class HelloUser {
    private String username;

    public HelloUser(String username) {
        this.username = username;
    }

    public void greetUser2() {
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append(getUsername());
        stringBuilder.append("!");
        System.out.println(stringBuilder.toString());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
