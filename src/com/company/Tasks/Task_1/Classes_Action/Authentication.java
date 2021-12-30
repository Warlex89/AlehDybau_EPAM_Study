package com.company.Tasks.Task_1.Classes_Action;
import com.company.Tasks.Task_1.Classes_Information.User;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Authentication {
    WorkWithAccount wwa = new WorkWithAccount();
    SwitchPanel sp = new SwitchPanel();
    String usersStatus;

    public void authenticationUsers(){
        Scanner sc = new Scanner(in);
        out.println("Введите логин ");
        String login = sc.nextLine();
        if(checkLogin(login)){
            out.println("Введите пароль ");
            String password = sc.nextLine();
            if(checkPassword(login, password)){
                out.println("Вы успешно прошли аутентификацию");
                sp.run(getUsersStatus());
            } else out.println("Неправильный пароль");
        }else out.println("Пользователя с таким логином не существует");
    }

    public boolean checkLogin(String login){
        boolean checkLog = false;
        for (User user : wwa.users){
            if (user.getLogin().toLowerCase().
                    compareTo(login.toLowerCase().trim()) == 0) {
                checkLog = true;
                break;
            }
        }
        return checkLog;
    }

    public boolean checkPassword(String login, String pass){
        boolean checkAcc = false;
        for (User user : wwa.users){
            if (user.getLogin().toLowerCase().
                    compareTo(login.toLowerCase().trim()) == 0) {
                if (user.getPassword().compareTo(wwa.passHash(pass)) == 0){
                    checkAcc = true;
                    usersStatus = user.getUserType().getName();
                }
            }
        }
        return checkAcc;
    }

    public String getUsersStatus() {
        return usersStatus;
    }
}
