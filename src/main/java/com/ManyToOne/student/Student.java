package com.ManyToOne.student;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name ="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
}
