/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

//import lab.Modaretor.PageModerator;

import lab.pageModaretor.PageModerator;


public class Facade {
public static void main(String[] args) {
PageModerator moderator = new PageModerator();
moderator.displaybag_1();
moderator.displaybag_2();
moderator.displaybag_3();
}
}