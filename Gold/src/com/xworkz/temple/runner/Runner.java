package com.xworkz.temple.runner;

import com.xworkz.temple.external.*;
import com.xworkz.temple.internal.*;

public class Runner {
    public static void main(String[] args) {
        Army army = new Army();
        army.showTankDetails();

        People people = new People();
        people.seeTank();

        Shop shop = new Shop();
        shop.displayKeyChain();

        Customer customer = new Customer();
        customer.checkKeyChain();

        Office office = new Office();
        office.showBadgeDetails();

        Visitor visitor = new Visitor();
        visitor.checkBadge();

        Government government = new Government();
        government.showPostOfficeDetails();

        Public pub = new Public();
        pub.checkPostOffice();

        Company company = new Company();
        company.showOccupationDetails();

        Employee employee = new Employee();
        employee.checkOccupation();

        Mechanic mechanic = new Mechanic();
        mechanic.showGarageDetails();

        Customers customers = new Customers();
        customers.visitGarage();

        Pilot pilot = new Pilot();
        pilot.showJetDetails();

        Passenger passenger = new Passenger();
        passenger.viewJet();

        Xmen xmen = new Xmen();
        xmen.showMutantDetails();

        Fan fan = new Fan();
        fan.watchMutant();

        Building building = new Building();
        building.showApartmentDetails();

        Tenant tenant = new Tenant();
        tenant.checkApartment();

        GymOwner owner = new GymOwner();
        owner.showGymDetails();

        GymMember member = new GymMember();
        member.checkGym();

    }
}
