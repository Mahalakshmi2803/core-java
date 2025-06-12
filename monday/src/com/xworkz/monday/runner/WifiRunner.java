package com.xworkz.wifi.runner;

import com.xworkz.monday.dto.WifiDto;
import com.xworkz.monday.exception.NoWifiConnectionException;
import com.xworkz.monday.service.WifiConnectionService;
import com.xworkz.monday.service.WifiConnectionServiceImpl;

import java.util.Scanner;

public class WifiRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WifiConnectionService wifiConnectionService = new WifiConnectionServiceImpl();

        System.out.println("Enter device name");
        String name = scanner.nextLine();

        System.out.println("Is wifi connected?");
        boolean isConnected  = scanner.nextBoolean();

        WifiDto wifiDto = new WifiDto(isConnected,name);

        try{
            wifiConnectionService.checkConnection(wifiDto);
        }catch (NoWifiConnectionException
                e){
            System.out.println("Error:" +e.getMessage());
        }
    }
}
