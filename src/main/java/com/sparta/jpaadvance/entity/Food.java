package com.sparta.jpaadvance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @OneToMany(mappedBy = "food") // N : 주문은 여러 번 될 수 있기 때문에
    private List<Order> orderList = new ArrayList<>();
    // Order 테이블을 통해서 User를 줘야 할 생각이 없다면 생략 가능
}