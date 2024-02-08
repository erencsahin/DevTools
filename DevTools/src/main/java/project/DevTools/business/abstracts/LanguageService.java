package project.DevTools.business.abstracts;

import java.util.List;

import project.DevTools.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language getById(int id);
}
