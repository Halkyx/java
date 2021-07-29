import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        firstHomework();
        // secondHomework();
    }

    static public void firstHomework(){
        // Initialization
        Validate validate = new Validate();
        ArrayList<String> emailList = new ArrayList<String>();
        EmailInput input = new EmailInput();

        // Execution
        emailList = input.inputEmail(emailList);
        for (String string : emailList) {
            if (validate.Email(string)) {
                System.out.printf("Email %s la hop le\n", string);
            } else {
                System.out.printf("Email %s la KHONG hop le\n", string);
            }
        }
    }

    static public void secondHomework() {
        // Initialization
        StandardizedName stdName = new StandardizedName();
        NameInput input = new NameInput();
        ArrayList<String> nameList = new ArrayList<String>();

        //Execution
        nameList = input.inputName(nameList);
        for (String string : nameList) {
            int index = nameList.indexOf(string);
            nameList.set(index, stdName.standardizedName(string));
        }
        System.out.println("Danh sach ten hoc vien:");
        nameList.forEach(p -> System.out.println(p));
    }
}