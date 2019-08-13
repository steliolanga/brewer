package co.mz.schoolCtrl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.mz.schoolCtrl.model.Grade;
import co.mz.schoolCtrl.repository.GradeRepository;

@Service
public class GradeServices {

	@Autowired 
	private GradeRepository gradeRepository;

	@Transactional
	public void save(Grade ingrediente){
		gradeRepository.save(ingrediente);
	}
		
	public Grade findOne(Long id){
		return gradeRepository.findOne(id);
	}
	
	public Iterable<Grade> findAll(){	
		return gradeRepository.findAll();
	}
	
	public void remove(Long id){
		Grade ingrediente = this.findOne(id);
		if(ingrediente!=null) gradeRepository.delete(ingrediente);
	}
	
}
