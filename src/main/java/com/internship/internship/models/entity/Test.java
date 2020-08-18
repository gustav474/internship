package com.internship.internship.models.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NonNull
    private String value;
}