package org.couchpotato.rentanything.controller;

import java.util.List;

import org.couchpotato.rentanything.model.Remark;
import org.couchpotato.rentanything.repository.RemarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remarks")
public class RemarkController
{


	@Autowired
	RemarkRepository remarkRepository;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Remark> getAll()
	{
		return (List<Remark>) remarkRepository.findAll();
	}


}
