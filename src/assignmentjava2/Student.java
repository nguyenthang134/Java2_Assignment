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
public class Student {
    private String id;
    private String name;
    private double money;
    private String date;

    public Student(String id, String name, double money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", money=" + money + ", date=" + date + '}';
    }
}
