package project.DevTools.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.DevTools.entities.concretes.Tech;

public interface TechDao extends JpaRepository<Tech, Integer>{

}
