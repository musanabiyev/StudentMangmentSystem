/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.menu.MenuAddTeacherServiceInter;

/**
 *
 * @author M
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processLogic() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        System.out.println("enter surname");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc2.nextLine();
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("teacherv added");

    }

}
