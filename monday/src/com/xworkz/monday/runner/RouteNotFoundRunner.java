package com.xworkz.route.runner;

import com.xworkz.monday.dto.RouteNotFoundDto;
import com.xworkz.monday.exception.RouteNotFoundException;
import com.xworkz.monday.service.RouteNotFoundService;
import com.xworkz.monday.service.RouteNotFoundServiceImpl;

import java.util.Scanner;

public class RouteNotFoundRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RouteNotFoundService routeNotFoundService = new RouteNotFoundServiceImpl();
        System.out.println("Enter Destination");
        String destination = scanner.nextLine();

        RouteNotFoundDto routeNotFoundDto = new RouteNotFoundDto(destination);

        try{
            routeNotFoundService.checkRoute(routeNotFoundDto);
        }catch (RouteNotFoundException e){
            System.out.println("Error:" +e.getMessage());
        }
    }
}
