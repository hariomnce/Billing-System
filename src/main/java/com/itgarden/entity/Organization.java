package com.itgarden.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@Entity
@Table(name = "organization")
public class Organization extends  BaseObject{

    @Column(name = "org_code", nullable = false)
    private String orgCode;

    @Column(name = "org_name", nullable = false)
    private String orgName;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

}
