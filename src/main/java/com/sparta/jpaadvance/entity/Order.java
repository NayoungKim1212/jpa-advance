package com.sparta.jpaadvance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 관계를 맺기 위해 직접 만들었기 때문에 각각 생성해줘야함
    @ManyToOne // Many : 처음에 오는게 현재 Entity 클래스
              // One : 두 번째 오는게 상대 Entity
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}