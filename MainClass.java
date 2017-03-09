package employee1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager boss = new Manager("nama boss", "Bandung", 500000);
        boss.setBonus(500000);
        
        Employee1[] Em = new Employee1[3];
        Em[0] = boss;
        Em[1] = new Staff("nama staff 1", "Bandung", 200000);
        Em[2] = new Staff("nama staff 2", "Bandung", 400000);
        
        for (int i = 0; i < Em.length; i++) {
            System.out.println(Em[i].getName() + "\t\t"+Em[i].getSalary());
        }
    }
    
}
