/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author User
 */
public class mainStack {
    public static void main(String[] args) {
        stack newStack = new stack(10);
        newStack.push(50);
        newStack.printData();
        newStack.push(100);
        newStack.printData();
        newStack.pop();
        newStack.printData();
        newStack.push(60);
        newStack.printData();
        newStack.push(80);
        newStack.printData();
        newStack.pop();
        newStack.printData();
        long bacaTop = newStack.peek();
        System.out.println("nilai top = "+bacaTop);
    }
}
