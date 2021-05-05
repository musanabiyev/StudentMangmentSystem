/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static java.awt.SystemColor.menu;
import java.util.Scanner;

/**
 *
 * @author M
 */
public class MenuUtil {

    public static void showMenu() {
        System.out.println("please select menu");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);

        int selectedMenuNumber = sc.nextInt();
        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}
