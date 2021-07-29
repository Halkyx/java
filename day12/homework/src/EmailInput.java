import java.util.ArrayList;

public class EmailInput {
    public ArrayList<String> inputEmail(ArrayList<String> emails) {
        emails.add("user@domain.com");
        emails.add("user2domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");
        emails.add("user#domain.com");
        emails.add("@yahoo.com");
        return emails;
    }
}