package com.bootPlay.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

  @Id
  private Long id;
  private String name;
  private String role;

}
