package org.couchpotato.rentanything.controller;

import java.util.List;

import org.couchpotato.rentanything.model.Place;
import org.couchpotato.rentanything.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/places")
public class PlaceController
{

	@Autowired
	PlaceRepository placeRepository;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Place> getAll()
	{
		return (List<Place>) placeRepository.findAll();
	}



}
