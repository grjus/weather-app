package com.project.weather.geolocation.exceptions;

public class GeolocationFetchingException extends Exception {

    public GeolocationFetchingException(String errorMessage, Throwable error) {
        super(errorMessage,error);
    }
}
