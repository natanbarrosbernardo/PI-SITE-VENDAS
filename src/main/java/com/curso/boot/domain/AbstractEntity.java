
 package com.curso.boot.domain;

 import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
Import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
 @Mapped Superclass
 public abstract class AbstractEntity<ID extends Serializable> implements Serializable (


@Id
@GeneratedValue(strategy GenerationType.IDENTITY){

private ID Id;


@Override

public int hashCode() {

final int prime = 31;

int result = 1;

result = prime result + ( (Id = rul * 1) ? 8: Id.hashCode());

return result;

}}