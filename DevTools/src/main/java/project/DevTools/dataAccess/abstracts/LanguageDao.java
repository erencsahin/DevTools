package project.DevTools.dataAccess.abstracts;

import java.util.List;


import project.DevTools.entities.concretes.Language;

public interface LanguageDao{
	List<Language> getall();
	Language getById(int id);
}
