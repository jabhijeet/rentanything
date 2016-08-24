package org.couchpotato.rentanything.controller;

import java.util.List;

import org.couchpotato.rentanything.model.Item;
import org.couchpotato.rentanything.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController
{

	@Autowired
	ItemRepository itemRepository;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Item> getAll()
	{
		return (List<Item>) itemRepository.findAll();
	}

}
