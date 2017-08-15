package edu.mum.apms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.apms.dao.BacklogDao;
import edu.mum.apms.model.Backlog;
import edu.mum.apms.model.Feature;

@Service
public class BacklogServiceImpl implements BacklogService{

	@Autowired
	private BacklogDao backlogDao;
	
	@Override
	@Transactional
	public Backlog getBacklogById(int backlogId) {
		return backlogDao.findOne(backlogId);
	}

	@Override
	@Transactional
	public List<Backlog> getAllBacklogByProject(int projectId) {
		
		return null;
		//return backlogDao.geByProjecttAll(projectId);
	}

	@Override
	@Transactional
	public List<Backlog> getAllActiveBacklogByProject(int projectId) {
		return null;
		//return backlogDao.getAllActiveByProject(projectId);
	}

	@Override
	@Transactional
	public void addBacklog(Backlog backlog) {
		backlogDao.add(backlog);
	}

	@Override
	@Transactional
	public void updateBacklog(Backlog backlog) {
		backlogDao.edit(backlog);		
	}

	@Override
	@Transactional
	public void deleteBacklog(int backlogId) {
		backlogDao.delete(backlogId);		
	}

	@Override
	public List<Feature> getAddableFeatures(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
