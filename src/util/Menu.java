/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import service.inter.Process;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import static util.MenuUtil.showMenu;
import service.inter.Process;
/**
 *
 * @author M
 */
public enum Menu {
    LOGIN(1, "login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all students", new MenuShowStudentService()),
    UNKNOWN;
    private int number;
    private String label;
    private Process service;

    Menu() {

    }

    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }

                } else if (Config.isLoggedIn()) {

                    System.out.println(menus[i]);
                }

            }
        }
    }
}
