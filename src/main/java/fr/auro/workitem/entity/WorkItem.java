package fr.auro.workitem.entity;

public class WorkItem {

    private Long identifier;
    private String summary;
    private String status;
    private String gbu;
    private String organisation;
    private String project;
    private String ownedby;
    private String deliveryTeamInCharge;
    private String description;
    
    
    
	public WorkItem(Long identifier, String summary, String status, String gbu, String organisation, String project,
			String ownedby, String deliveryTeamInCharge, String description) {
		super();
		this.identifier = identifier;
		this.summary = summary;
		this.status = status;
		this.gbu = gbu;
		this.organisation = organisation;
		this.project = project;
		this.ownedby = ownedby;
		this.deliveryTeamInCharge = deliveryTeamInCharge;
		this.description = description;
	}
	public Long getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGbu() {
		return gbu;
	}
	public void setGbu(String gbu) {
		this.gbu = gbu;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getOwnedby() {
		return ownedby;
	}
	public void setOwnedby(String ownedby) {
		this.ownedby = ownedby;
	}
	public String getDeliveryTeamInCharge() {
		return deliveryTeamInCharge;
	}
	public void setDeliveryTeamInCharge(String deliveryTeamInCharge) {
		this.deliveryTeamInCharge = deliveryTeamInCharge;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public WorkItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkItem other = (WorkItem) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;
	}
    
    
	
}
