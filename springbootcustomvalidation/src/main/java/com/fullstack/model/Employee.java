package com.fullstack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @NotBlank(message = "Employee Name should not be null or empty")
    private String empName;

    @NotNull(message = "Employee Address should not be null")
    private String empAddress;

    @Range(min = 1000000000, max = 9999999999L, message = "Contact Number must be 10 digit")
    private long empContactNumber;

    @NotEmpty(message = "Employee Gender should not be empty")
    private String empGender;

    @Email(message = "Email ID must be valid")
    private String empEmailId;

    @Size(min = 4, message = "Employee Password should be atleast 4 characters")
    private String empPassword;

}
