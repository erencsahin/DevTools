package project.DevTools.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.DevTools.business.abstracts.LanguageService;
import project.DevTools.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService=languageService;
	}
	@GetMapping("/getall")
	public List<Language> getall()
	{
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public Language getById(int id) 
	{
		return languageService.getById(id);
	}
	
}
