package project.DevTools.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import project.DevTools.business.abstracts.TechService;
import project.DevTools.business.requests.CreateTechRequest;
import project.DevTools.business.requests.UpdateTechRequest;
import project.DevTools.business.responses.GetAllTechResponses;
import project.DevTools.business.responses.GetByIdTechResponses;
import project.DevTools.common.utilities.mappers.ModelMapperService;
import project.DevTools.dataAccess.abstracts.TechDao;
import project.DevTools.entities.concretes.Tech;

@Service
@AllArgsConstructor
public class TechManager implements TechService{
	@Autowired
	private TechDao techDao;
	@Autowired
	private ModelMapperService mapperService;
	
	@Override
	public List<GetAllTechResponses> getAll() {
		List<Tech> techs= techDao.findAll();
		List<GetAllTechResponses> techResponse = techs.stream()
				.map(tec->this.mapperService.forResponse()
						.map(tec, GetAllTechResponses.class)).toList();
		return techResponse;
	}

	@Override
	public GetByIdTechResponses GetById(int id) {
		Tech tech=this.techDao.findById(id).orElseThrow();
		GetByIdTechResponses techResponse= this.mapperService.forResponse()
				.map(tech, GetByIdTechResponses.class);
		return techResponse;
	}

	@Override
	public void Add(CreateTechRequest createTechRequest) {
		Tech tech = this.mapperService.forRequest()
				.map(createTechRequest, Tech.class);
		
		this.techDao.save(tech);
	}

	@Override
	public void Update(UpdateTechRequest updateTechRequest) {
		Tech tech = this.mapperService.forRequest()
				.map(updateTechRequest, Tech.class);
		this.techDao.save(tech);
	}

	@Override
	public void Delete(int id) {
		this.techDao.deleteById(id);
		
	}

}
