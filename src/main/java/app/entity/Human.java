package entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

/* generates a constructor with no parameters */
@NoArgsConstructor

/* generates a constructor with 1 parameter for each field in a class */
@AllArgsConstructor
public class Human{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firtsName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column()
    private Double height;

    @Column
    private Double weight;

    @Column(name = "fat_percentage")
    private Double fatPercentage;

    // setters

    // getters


    
    // returns a String representation of the object
    public String toString(){
        return "data of the object";
    }

}
