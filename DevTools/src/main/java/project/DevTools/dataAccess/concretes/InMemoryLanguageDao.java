package project.DevTools.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import project.DevTools.dataAccess.abstracts.LanguageDao;
import project.DevTools.entities.concretes.Language;

@Repository
public class InMemoryLanguageDao implements LanguageDao {
	List<Language> languages;

	public InMemoryLanguageDao() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"Kotlin"));
		languages.add(new Language(3,"C#"));
		languages.add(new Language(4,"JavaScript"));
		languages.add(new Language(5,"C++"));
	}

	@Override
	public List<Language> getall() {
		return languages;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId()==id) {
				return language;
			}
		}
		return null;
	}
	
	
	
}
