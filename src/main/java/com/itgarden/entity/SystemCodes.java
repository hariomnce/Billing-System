package com.itgarden.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Getter
@Setter
@Entity
@Table(name = "system_codes")
public class SystemCodes extends BaseObject {

    @Column(name = "code_prefix", nullable = false)
    private String codePrefix;

    @Column(name = "code_type", nullable = false)
    private String codeType;

}
