package project.DevTools.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import project.DevTools.business.abstracts.LanguageService;
import project.DevTools.business.requests.CreateLanguageRequest;
import project.DevTools.business.requests.UpdateLanguageRequest;
import project.DevTools.business.responses.GetAllLanguageResponse;
import project.DevTools.business.responses.GetByIdLanguageResponses;
import project.DevTools.common.utilities.mappers.ModelMapperService;
import project.DevTools.dataAccess.abstracts.LanguageDao;
import project.DevTools.entities.concretes.Language;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService{
	private LanguageDao languageDao;
	private ModelMapperService mapperService;

	
	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<Language> languages = languageDao.findAll();
		List<GetAllLanguageResponse> languageResponse = languages.stream()
				.map(lang->this.mapperService.forResponse()
						.map(lang, GetAllLanguageResponse.class)).toList();
		return languageResponse;
	}


	@Override
	public void Add(CreateLanguageRequest createLanguageRequest) {
		Language language = this.mapperService.forRequest()
				.map(createLanguageRequest, Language.class);
		
		this.languageDao.save(language);
	}


	@Override
	public void Delete(int id) {
		this.languageDao.deleteById(id);
	}


	@Override
	public GetByIdLanguageResponses GetById(int id) {
		Language lang=  this.languageDao.findById(id).orElseThrow();
		GetByIdLanguageResponses response = this.mapperService.forResponse()
				.map(lang, GetByIdLanguageResponses.class);
		
		return response;
	}


	@Override
	public void Update(UpdateLanguageRequest updatelanguageRequest) {
		Language lang=this.mapperService.forResponse().map(updatelanguageRequest, Language.class);
		this.languageDao.save(lang);
	}
}
