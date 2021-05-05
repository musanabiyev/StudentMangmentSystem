/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Student;
import java.util.Scanner;
import service.inter.menu.MenuAddStudentServiceInter;
import bean.Config;

/**
 *
 * @author M
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        System.out.println("enter surname");
        Scanner sc2 = new Scanner(System.in);

        String surname = sc2.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("student added");

    }

}
