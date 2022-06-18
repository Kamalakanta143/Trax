package com.trax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.trax.entities.Contact;
import com.trax.repositories.ContactRepository;

@Controller
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveLead(Contact contact) {
		contactRepo.save(contact);

	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
