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
import project.DevTools.business.abstracts.LanguageService;
import project.DevTools.business.requests.CreateLanguageRequest;
import project.DevTools.business.requests.UpdateLanguageRequest;
import project.DevTools.business.responses.GetAllLanguageResponse;
import project.DevTools.business.responses.GetByIdLanguageResponses;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {
	private LanguageService languageService;
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getall()
	{
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void Add(CreateLanguageRequest createLanguageRequest) 
	{
		this.languageService.Add(createLanguageRequest);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(int id) 
	{
		this.languageService.Delete(id);
	}
	
	@GetMapping("/getbyid")
	public GetByIdLanguageResponses GetById(int id) {
		return this.languageService.GetById(id);
	}
	
	@PutMapping("/update")
	public void Update(UpdateLanguageRequest languageRequest) 
	{
		this.languageService.Update(languageRequest);
	}
	
	
}
