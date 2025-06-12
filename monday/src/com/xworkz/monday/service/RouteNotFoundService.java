package com.xworkz.monday.service;

import com.xworkz.monday.dto.RouteNotFoundDto;
import com.xworkz.monday.exception.RouteNotFoundException;

public interface RouteNotFoundService {
    boolean checkRoute(RouteNotFoundDto routeNotFoundDto) throws RouteNotFoundException;
}
