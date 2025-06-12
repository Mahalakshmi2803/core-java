package com.xworkz.monday.service;

import com.xworkz.monday.dto.WifiDto;
import com.xworkz.monday.exception.NoWifiConnectionException;

public class WifiConnectionServiceImpl implements WifiConnectionService{

    @Override
    public boolean checkConnection(WifiDto wifiDto) throws NoWifiConnectionException {
        if(wifiDto == null){
            throw new NullPointerException("WifiDto is null");
        }
        if(!wifiDto.isWifiConnection()){
            throw new NoWifiConnectionException("No wifi connection for Device"+wifiDto.getDeviceName());
        }
        System.out.println("Device" +wifiDto.getDeviceName()+"is connected to wifi");
        return true;
    }
}
