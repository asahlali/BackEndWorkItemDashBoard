package fr.auro.workitem.service;

import java.util.List;

import fr.auro.workitem.entity.WorkItem;

public interface IWorkitemService {
	
	List<WorkItem> getWorkItem();
	void addWorkItem(WorkItem w);
	void updateWorkItem(WorkItem w);
	void deleteWorkItem(Long i);
}
