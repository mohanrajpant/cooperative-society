package com.cooperative.society.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonProperty  private long accountId;
    @JsonProperty  private String firstName;
    @JsonProperty  private String lastName;
    @JsonProperty  private String gender;
    @JsonFormat(pattern = "dd-MM-yyyy") private LocalDate dateOfBirth;
    @JsonFormat(pattern = "dd-MM-yyyy") private LocalDate dateOfJoining;
    @JsonProperty private BigDecimal memberDeposit;
    @JsonProperty private String mobileNumber;
    @JsonProperty private String homeAddress;
    @JsonProperty private String businessAddress;
    @JsonProperty private String city;
    @JsonProperty private long pinCode;
    @JsonProperty private String state;
    @JsonProperty private String idForms;
    @JsonProperty private String attachements;

    public Member() { }


    public Member(long accountId,
      String firstName,
      String lastName,
      String gender,
      LocalDate dateOfBirth,
      LocalDate dateOfJoining,
      BigDecimal memberDeposit,
      String mobileNumber,
      String homeAddress,
      String businessAddress,
      String city,
      long pinCode,
      String state,
      String idForms,
      String attachements
    ) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.memberDeposit = memberDeposit;
        this.mobileNumber = mobileNumber;
        this.homeAddress = homeAddress;
        this.businessAddress = businessAddress;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.idForms = idForms;
        this.attachements = attachements;
    }

    @Override
    public String toString() {
        return "Member{" +
            "accountId=" + accountId +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}
