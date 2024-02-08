package project.DevTools.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.DevTools.business.abstracts.LanguageService;
import project.DevTools.dataAccess.abstracts.LanguageDao;
import project.DevTools.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) 
	{
		this.languageDao=languageDao;
	}

	
	@Override
	public List<Language> getAll() {
		return languageDao.getall();
	}


	@Override
	public Language getById(int id) {
		return languageDao.getById(id);
	}

}
