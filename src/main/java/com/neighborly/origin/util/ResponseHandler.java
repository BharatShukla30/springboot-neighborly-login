package com.neighborly.origin.util;

import com.neighborly.origin.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Map<Object, Object>> responseBuilder(Object data, String message, HttpStatus httpStatus){
        Map<Object, Object> response = new HashMap<>(){
            {
                put(ApiResponse.data, data);
                put(ApiResponse.status, httpStatus.value());
                put(ApiResponse.message, message);
            }
        };
        return new ResponseEntity<>(response, httpStatus);
    }
}
