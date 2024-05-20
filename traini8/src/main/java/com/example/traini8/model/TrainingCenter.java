package com.example.traini8.model;




import java.time.Instant;
import java.util.List;
import jakarta.validation.constraints.*;
import lombok.Data;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(max = 40)
    private String centerName;

    @NotEmpty
    @Size(min = 12, max = 12)
    private String centerCode;

    @Embedded
    private Address address;

    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private long createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid phone number")
    private String contactPhone;

    
}

@Embeddable
@Data
class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

    
}
