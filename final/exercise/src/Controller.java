import java.util.List;
import java.util.Scanner;

public class Controller {
    User MyAccount = null;
    String username;
    String password;

    Repository repository = new Repository();
    List<User> users = repository.getData();

    Scanner scanner = new Scanner(System.in);

    public void welcome() {
        Menu.mainMenu();
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                // Login
                login();
                break;
            case 2:
                // Register
                createNewAccount();
                break;
            default:
                break;
        }
    }

    public void login() {

        // Login process
        System.out.println("Username: ");
        username = scanner.nextLine();

        System.out.println("Password: ");
        password = scanner.nextLine();

        MyAccount = checkUsername(username);

        if (MyAccount != null) {
            checkPassword(password);
        } else {
            System.out.println("Please recheck your Username. ");
            login();
        }

    }

    private User checkUsername(String username) {

        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }

    private void checkPassword(String password) {
        if (password.equals(MyAccount.getPassword())) {
            System.out.println("Login successfully");
            Home();
        } else {
            System.out.println("Wrong password. Do you want to: \n" + " (1- Re-login), (2-Forgot Password?), (3-Quit)");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> login();
                case 2 -> forgotPassword();
                case 3 -> System.exit(0);
            }
        }
    }

    // Login succesfully -> Show account settings (Change Username / Change Email /
    // Change Password)
    private void Home() {
        Menu.Home();
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1 -> {
                System.out.println("New Username: ");
                changeUsername(scanner.nextLine());
            }
            case 2 -> {
                System.out.println("Current Email: " + MyAccount.getEmail());
                ;
                System.out.println("New Email: ");
                changeEmail(scanner.nextLine());
            }
            case 3 -> {
                System.out.println("New Pasword: ");
                changePassword(scanner.nextLine());
            }
            case 4 -> welcome();
            case 0 -> System.exit(0);
        }
        System.out.println("New changes applied!");
        Home();
    }

    // check duplicated Username:
    private void changeUsername(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                System.out.println("This Username has already been taken, please use another Username: ");
                changeUsername(scanner.nextLine());
                return;
            }
        }
        MyAccount.setUsername(username);
    }

    private void changePassword(String password) {
        try {
            MyAccount.setPassword(Validate.validatePassword(password));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("New Password: ");
            changePassword(scanner.nextLine());
        }
    }

    /*
     * check duplicated Email -> validate Email
     */
    private void changeEmail(String email) {

        for (User user : users) {
            if (email.equals(user.getEmail())) {
                System.out.println("This Email has already been taken, please use another Email: ");
                changeEmail(scanner.nextLine());
                return;
            }
        }

        try {
            MyAccount.setEmail(Validate.validateEmail(email));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Confirm Email: ");
            changeEmail(scanner.nextLine());
        }
        System.out.println("New email: " + MyAccount.getEmail());
    }

    private void forgotPassword() {
        System.out.println("Registered Email: ");
        String inputEmail = scanner.nextLine();

        if (inputEmail.equals(MyAccount.getEmail())) {
            System.out.println("New Password: ");
            changePassword(scanner.nextLine());
            System.out.println("Return to login screen");
            login();
        } else {
            System.out.println("Invalid Email");
            System.out.println("Exit");
        }

    }

    /*
     * Validate email, password -> check duplicated username/email
     */
    public void createNewAccount() {
        User newUser = new User();
        System.out.println("New Username: ");
        newUser.setUsername(scanner.nextLine());
        try {
            System.out.println("New Email: ");
            newUser.setEmail(Validate.validateEmail(scanner.nextLine()));

            System.out.println("New Password: ");
            newUser.setPassword(Validate.validatePassword(scanner.nextLine()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Please register again");
            createNewAccount();
        }
        // check duplicated username // email
        for (User user : users) {
            if (newUser.getUsername().equals(user.getUsername())) {
                System.out.println("This Username has already been taken, please use another Username: ");
                createNewAccount();
            }
            if (newUser.getEmail().equals(user.getEmail())) {
                System.out.println("This Email has already been taken, please use another Email: ");
                createNewAccount();
            }
        }

        System.out.println("Register successfully. Returning to login screen...");
        users.add(newUser);
        login();
    }
}