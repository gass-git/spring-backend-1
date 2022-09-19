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
public class Human{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    // This can be improved by using the date of birth
    private int age;
    private double height;
    private float weight;

    @Column(name = "fat_percentage")
    private double fatPercentage;

    // -- setters --
    // writing the setter methods can be avoided by using the @Setters annotation
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setAge(int age){ this.age = age; }
    public void setHeight(float height){ this.height = height; }
    public void setWeight(float weight){ this.weight = weight; }
    public void fatPercentage(float fatPercentage){this.fatPercentage = fatPercentage;}

    // -- getters --
    // writing the getter methods can be avoided by using the @Getters annotation
    public String getFirstName(){ return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public double getHeight() { return height; }
    public float getWeight() { return weight; }
    public double getFatPercentage() { return fatPercentage; }
}
