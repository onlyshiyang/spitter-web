package com.habuma.spitter.mvc.domain;


import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

public class Spittle implements Serializable {
  private static final long serialVersionUID = 1L;

  public int id;
  public int spitter;
  public String text;
  
  @DateTimeFormat(pattern="hh:mma MMM d, YYYY")
  private Date when;

  public Spittle() {
    
  }
  
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  public Date getWhen() {
    return this.when;
  }

  public void setWhen(Date when) {
    this.when = when;
  }

  public int getSpitterId() {
    return this.spitter;
  }

  public void setSpitter(int spitter) {
    this.spitter = spitter;
  }
  
}