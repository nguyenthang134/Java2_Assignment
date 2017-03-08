/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentjava2;

/**
 *
 * @author Thang
 */
public class NewClass {

    public static void main(String[] args) {
        String string = "A0003			Nguyen Thi C		300.000		07/01/2017";
//        String[] parts = string.split(" ");
//        String part2 = parts[1];
        String[] info = string.split("  ");
        for (int i = 0; i < info.length; i++) {
            String string1 = info[i];
            System.out.println(string1.trim());
        }
    }
}
