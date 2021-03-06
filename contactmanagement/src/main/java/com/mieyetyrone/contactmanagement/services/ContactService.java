package com.mieyetyrone.contactmanagement.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mieyetyrone.contactmanagement.entities.Contact;
import com.mieyetyrone.contactmanagement.repository.ContactRepository;


@Component
public class ContactService {

	private ContactRepository contactRepository;
	
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}
	
	public Contact addContact(Contact contact) {
		return contactRepository.save(contact);
	} 
}
