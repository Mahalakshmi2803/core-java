package com.xworkz.temple.external;


public class Runner {
    public static void main(String[] args) {
        String name="Mahalakshmi";
        String updatedName=name.concat("_PH");

        System.out.println("Name:"+name);
        System.out.println("UpdatedName:"+updatedName);
        String uName="Mahalakshmi_PH";
        if(uName == updatedName ){
            System.out.println("matching");
        }
        else{
            System.out.println("Not Matching");
        }
    }
}
