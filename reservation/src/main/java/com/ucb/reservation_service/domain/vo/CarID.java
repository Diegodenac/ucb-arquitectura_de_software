package com.ucb.reservation_service.domain.vo;

import java.util.UUID;

public class CarID {

    private UUID id;

    private CarID(UUID id){
        this.id= id;
    }

    public static CarID withID(String id){
        return new CarID(UUID.fromString(id));
    }

    public static CarID withoutId(){
        return new CarID(UUID.randomUUID());
    }
}
