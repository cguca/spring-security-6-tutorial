package com.chicobanana.eazybank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chicobanana.eazybank.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}