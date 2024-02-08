package project.DevTools.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.DevTools.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	
}
