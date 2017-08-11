package edu.mum.apms.service;

import java.util.List;

import edu.mum.apms.model.WorkLog;

public interface WorklogService {
	
	public WorkLog getWorklogById(int worklogId);

	public List<WorkLog> getAllWorklogByTask(int taskId);

	public void addWorklog(WorkLog worklog);

	public void updateWorklog(WorkLog worklog);

	public void deleteWorklog(int worklogId);
}
