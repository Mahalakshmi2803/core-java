package com.xworkz.temple.external;

import com.xworkz.temple.internal.Occupation;

public class Employee {

        public Employee() {
            System.out.println("no-args constructor of Employee");
        }

        public void checkOccupation() {
            System.out.println("checkOccupation running in Employee");
            Occupation occupation = new Occupation();

            System.out.println("Occupation Title: " + occupation.getTitle());
            System.out.println("Salary: " + occupation.getSalary());
            System.out.println("Work Hours: " + occupation.getWorkHours());
            System.out.println("Experience: " + occupation.getExperience());
            System.out.println("Is Remote: " + occupation.getIsRemote());
        }


}
