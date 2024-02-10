package project.DevTools.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import project.DevTools.business.abstracts.TechService;
import project.DevTools.business.requests.CreateTechRequest;
import project.DevTools.business.requests.UpdateTechRequest;
import project.DevTools.business.responses.GetAllTechResponses;
import project.DevTools.business.responses.GetByIdTechResponses;

@RestController
@RequestMapping("/api/techs")
@AllArgsConstructor
public class TechsController {

	private TechService techService;
	
	@GetMapping("/getall")
	public List<GetAllTechResponses> getAll()
	{
		return techService.getAll();
	}
	
	@GetMapping("/getbyid")
	GetByIdTechResponses GetById(int id) 
	{
		return techService.GetById(id);
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void Add(CreateTechRequest createTechRequest) 
	{
		this.techService.Add(createTechRequest);
	}
	
	@PutMapping("/update")
	public void Update(UpdateTechRequest updateTechRequest) 
	{
		this.techService.Update(updateTechRequest);
	}
	
	@DeleteMapping("/delete")
	public void Delete(int id) 
	{
		this.techService.Delete(id);
	}

	
	
	
	
}

