/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentjava2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 *
 * @author Thang
 */
public class AssignmentJava2 {

    /**
     * @param args the command line arguments
     */
    public static void readFile() {
        HashMap<String, Student> hm = new HashMap<String, Student>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("quylop.txt")));

            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] info = line.split("[\\s\\t]{2,}+");
                Student student = new Student(info[0].trim(),
                        info[1].trim(), Double.parseDouble(info[2].trim()),
                        info[3].trim());
                if (hm.containsKey(student.getId())) {
                    Student temp = hm.get(student.getId());
                    student.setMoney(temp.getMoney() + student.getMoney());
                }
                hm.put(student.getId(), student);
            }
            br.close();
            BufferedWriter gf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("quylop2.txt")));
            for (String key : hm.keySet()) {
                gf.write(hm.get(key).toString());
                gf.newLine();
            }
            gf.close();
        } catch (Exception e) {
        }
        for (String key : hm.keySet()) {
            System.out.println(hm.get(key).toString());
        }
    }

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        readFile();
    }
}
