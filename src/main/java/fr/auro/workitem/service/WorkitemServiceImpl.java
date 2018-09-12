package fr.auro.workitem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.auro.workitem.entity.WorkItem;
@Service
public class WorkitemServiceImpl implements IWorkitemService{
	

	private List<WorkItem> workItems;

	public WorkitemServiceImpl() {
		workItems = new ArrayList<WorkItem>();
		workItems.add(new WorkItem(Long.valueOf(737583),"Synchronisation temps réel des WAPITI","In Design","GBU france","FR Equipe LDC Casablanca","FR LDC Nantes - CNP","Abdellatif SAHLALI","FR Equipe LDC Casablanca", null));
		workItems.add(new WorkItem(Long.valueOf(7851912),"Evolution programme cooptation RH","On Hold","GBU france","FR Equipe LDC Casablanca","FR LDC Nantes - CNP","Abdellatif SAHLALI","FR Equipe LDC Casablanca",null));
		workItems.add(new WorkItem(Long.valueOf(7677919),"Monitoring des logs de la synchro","In Production","GBU france","FR Equipe LDC Casablanca","FR LDC Nantes - CNP","Abdellatif SAHLALI","FR Equipe LDC Casablanca",null));
	}

	@Override
	public List<WorkItem> getWorkItem() {
		return workItems;
	}

	@Override
	public void addWorkItem(WorkItem w) {
		workItems.add(w);
		
	}

	@Override
	public void updateWorkItem(WorkItem w) {
		workItems.remove(w);
		workItems.add(w);
	}

	@Override
	public void deleteWorkItem(Long i) {
		WorkItem wi = new WorkItem();
		wi.setIdentifier(i);
		workItems.remove(wi);
	}

}
