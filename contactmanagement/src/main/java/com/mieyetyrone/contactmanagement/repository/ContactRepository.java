package com.mieyetyrone.contactmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mieyetyrone.contactmanagement.entities.Contact;


@RepositoryRestResource()
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
