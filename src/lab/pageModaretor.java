/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author MAH
 */
public class pageModaretor {

    static class display {

        public display() {
        }
    }
public class PageModerator {
private ABC bagA;
private ABC bagB;
private ABC bagC;

public PageModerator(){
bagA = new bag_1();
bagB = new bag_2();
bagC = new bag_3();
}

public void displayA(){
bagA.displayPrice();
}

public void displayB(){
bagB.displayPrice();
}

public void displayC(){
bagC.displayPrice();
}

        void displaybag_1() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void displaybag_2() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void displaybag_3() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

}
}