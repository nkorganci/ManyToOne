package com.ManyToOne.subject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name ="subject")
public class Subject {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
}
