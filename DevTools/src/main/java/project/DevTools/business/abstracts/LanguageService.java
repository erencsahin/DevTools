package project.DevTools.business.abstracts;

import java.util.List;

import project.DevTools.business.requests.CreateLanguageRequest;
import project.DevTools.business.requests.UpdateLanguageRequest;
import project.DevTools.business.responses.GetAllLanguageResponse;
import project.DevTools.business.responses.GetByIdLanguageResponses;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll();
	GetByIdLanguageResponses GetById(int id);
	void Add(CreateLanguageRequest createLanguageRequest);
	void Update(UpdateLanguageRequest updatelanguageRequest);
	void Delete(int id);
}
