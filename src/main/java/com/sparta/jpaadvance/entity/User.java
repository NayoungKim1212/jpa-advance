package com.sparta.jpaadvance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}








//    public void addFood(Food food) {
//        this.food = food;
//        food.setUser(this); // this : 현재 객체 자신
//        // 객체 자신을 실제 외래 키의 주인한테 줌
//    }