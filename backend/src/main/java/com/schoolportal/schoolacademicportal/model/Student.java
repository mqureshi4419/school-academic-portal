package com.schoolportal.schoolacademicportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long studentId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
    
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private UserAccount userAccount;

}
