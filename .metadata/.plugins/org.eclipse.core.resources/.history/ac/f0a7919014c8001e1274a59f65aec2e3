package project.DevTools.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.DevTools.business.abstracts.LanguageService;
import project.DevTools.business.requests.CreateLanguageRequest;
import project.DevTools.business.responses.GetAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService=languageService;
	}
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getall()
	{
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void Add(CreateLanguageRequest createLanguageRequest) 
	{
		this.languageService.Add(createLanguageRequest);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(int id) 
	{
		this.languageService.Delete(id);
	}
	
	
}
