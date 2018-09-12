package fr.auro.workitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.auro.workitem.entity.WorkItem;
import fr.auro.workitem.service.IWorkitemService;

@RestController
@RequestMapping("/auro/api/workitem")
@CrossOrigin
public class WorkitemController {

	@Autowired
	public IWorkitemService ws;
	@GetMapping
	public List<WorkItem> getWorkItems() {
		return ws.getWorkItem();
	}
	@PostMapping
	public void addWorkItems(@RequestBody WorkItem w) {
		 ws.addWorkItem(w);
	}
	@PutMapping
	public void updateWorkItems(@RequestBody WorkItem w) {
		ws.updateWorkItem(w);
	}
	@DeleteMapping("/{iden}")
	public void deleteWorkItems(@PathVariable Long i) {
		ws.deleteWorkItem(i);
	}
}
