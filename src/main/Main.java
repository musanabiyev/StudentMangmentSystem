/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Config;
import util.MenuUtil;

public class Main {

    public static void main(String[] args) {
        Config.initialize();
        MenuUtil.showMenu();

    }

}
