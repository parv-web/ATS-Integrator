package com.barraiser.ATSIntegration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidate {

    @Id
    private String id;
    private String name;
    private String company;
    private String email;
    private String phone_no;
    private String resume;
    private String domain;
    private String role;
    private String bgs;
    private String bgs_link;
}
