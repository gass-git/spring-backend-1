package springboot_backend.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Human{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firtsName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "date_of_birth")
    private Date DateOfBirth;

    @Column
    private Double weight;

    @Column(name = "fat_percentage")
    private Double fatPercentage;
}
