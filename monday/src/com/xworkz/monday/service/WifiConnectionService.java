package com.xworkz.monday.service;

import com.xworkz.monday.dto.WifiDto;
import com.xworkz.monday.exception.NoWifiConnectionException;

public interface WifiConnectionService {
    boolean checkConnection(WifiDto wifiDto) throws NoWifiConnectionException;
}
