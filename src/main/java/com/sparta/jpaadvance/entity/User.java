package com.sparta.jpaadvance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST, orphanRemoval = true) // 외래 키 주인의 필드 : user
    private List<Food> foodList = new ArrayList<>(); // 데이터베이스 테이블에 영향을 미치지 X

    public void addFoodList(Food food) {
        this.foodList.add(food);
        food.setUser(this); // 외래 키 생성
    }


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    @OneToMany(mappedBy = "user") // 고객은 One, 주문을 여러 번 할 수 있음
//    private List<Order> orderList = new ArrayList<>();
//// Order 테이블을 통해서 Food를 줘야 할 생각이 없다면 생략 가능
}

