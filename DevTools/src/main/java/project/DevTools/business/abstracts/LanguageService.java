package project.DevTools.business.abstracts;

import java.util.List;

import project.DevTools.business.requests.CreateLanguageRequest;
import project.DevTools.business.responses.GetAllLanguageResponse;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll();
	void Add(CreateLanguageRequest createLanguageRequest);
	void Delete(int id);
}
