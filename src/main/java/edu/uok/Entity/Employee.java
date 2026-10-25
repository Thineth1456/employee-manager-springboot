package edu.uok.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank
    @Column
    private String department;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String full_name;
    @Pattern(regexp = "^[0-9]{10}$")
    private String phone;
    @Positive
    private double salary;


}
