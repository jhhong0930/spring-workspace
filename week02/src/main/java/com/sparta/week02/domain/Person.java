package com.sparta.week02.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    public Person(PersonRequestDTO requestDTO) {
        this.name = requestDTO.getName();
        this.age = requestDTO.getAge();
    }

    public void update(PersonRequestDTO requestDTO) {
        this.name = requestDTO.getName();
        this.age = requestDTO.getAge();
    }

}
