package project.DevTools.business.abstracts;

import java.util.List;

import project.DevTools.business.requests.CreateTechRequest;
import project.DevTools.business.requests.UpdateTechRequest;
import project.DevTools.business.responses.GetAllTechResponses;
import project.DevTools.business.responses.GetByIdTechResponses;

public interface TechService {
	List<GetAllTechResponses> getAll();
	GetByIdTechResponses GetById(int id);
	void Add(CreateTechRequest createTechRequest);
	void Update(UpdateTechRequest updateTechRequest);
	void Delete(int id);
}
