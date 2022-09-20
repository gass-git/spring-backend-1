package app.entity;

import javax.persistence.*;
import lombok.*;

/*
 * Constructor based Injection : 
 * When you create object by passing all parameters, you basically 
 * use a constructor injection. It should be done when we have all 
 * parameter values and we want to create an object with all values 
 * initialized.(@AllArgsConstructor)
 *
 * Setter based Injection: 
 * We create an object first (uses no arg-constructor) and then update
 * the dependencies or values later by using setters.(@NoArgsConstructor)
 * 
 * https://stackoverflow.com/questions/68314072/why-to-use-allargsconstructor-and-noargsconstructor-together-over-an-entity
 * 
 */

/* generates a constructor with no parameters */
@NoArgsConstructor

/* generates a constructor with 1 parameter for each field in a class */
@AllArgsConstructor

/* causes lombok to generate an implementation of the toString() method */
@ToString

/* annotation that produces complex builder APIs */
@Builder

/* specifies that the class is an entity and is mapped to a database table */
@Entity

/* create a table for the entity */
@Table(name = "clients")

@Setter
@Getter
public class Human{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    private String sex;

    // This can be improved by using the date of birth
    private int age;
    
    private double height;
    private float weight;

    @Column(name = "fat_percentage")
    private double fatPercentage;
}
