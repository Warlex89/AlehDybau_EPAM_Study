package com.company.Tasks.Task_1.Classes_Action;
import com.company.Tasks.Task_1.Classes_Information.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;
import static java.lang.System.out;

public class WorkWithAccount {
    ArrayList<User> users;
    UserType userType;

    public WorkWithAccount() {
        this.users = new ArrayList<>();
        readAccount();
    }

    public String passHash(String pass){
        byte[] bytes;
        Base64.Encoder encoder = Base64.getEncoder();
        bytes = encoder.encode(pass.getBytes(StandardCharsets.UTF_8));
        BigInteger bigInteger = new BigInteger(1,bytes);
        return bigInteger.toString(16);
    }

    public void readAccount(){
        try{
            FileReader fileReader =
                    new FileReader("src/com/company/Tasks/Task_1/Resources/users.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String[] usersLine = scanner.nextLine().split(" - ");
                try {
                    String login = usersLine[0];
                    String password = usersLine[1];
                    String email = usersLine[2];
                    Email usersEm = new Email(email);
                    String typeOfUser = usersLine[3];
                    switch (typeOfUser){
                        case "admin" -> userType = UserType.ADMIN;
                        case "user" -> userType = UserType.USER;
                    }
                    users.add(new User(login, password, usersEm, userType));
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void getAdminEmail(){
        for(User user : users){
            if (user.getUserType().getName().
                    compareTo("admin") == 0){
                out.println(user.getEmail().getEmail());
            }
        }
    }

    public void printAllAccounts(){
        users.forEach(out::println);
    }
}
