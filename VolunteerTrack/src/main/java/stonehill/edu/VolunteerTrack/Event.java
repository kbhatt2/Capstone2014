package stonehill.edu.VolunteerTrack;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
     private String OwnerEmail, name, description, location, organizationName;
     private int numPositions, numPositionsRemaining;
     private Date createdDateTime, startDateTime, endDateTime;
     private Skill [] skills;
     
     public Event () {
    	 OwnerEmail = "";
    	 name = "";
    	 createdDateTime = new Date();
    	 startDateTime = new Date();
    	 endDateTime = new Date();
    	 description = "";
    	 location = "";
    	 numPositions = 0;
    	 numPositionsRemaining = 0;
    	 skills = new Skill[0];
     }
     public Event (String partnerEmail, String name, Date createdDateTime, Date startDateTime, Date endDateTime, String description, String location , int numPositions, int numPositionsRemaining,Skill[] skills) {
     	 this.OwnerEmail = partnerEmail;
    	 this.name = name;
    	 this.createdDateTime = createdDateTime;
    	 this.startDateTime = startDateTime;
    	 this.endDateTime = endDateTime;
    	 this.description = description;
    	 this.location = location;
    	 this.numPositions = numPositions;
    	 this.numPositionsRemaining = numPositionsRemaining;
    	 this.skills = skills;
     }
     
     public User getPartner(){
    	 UserDao dao = new UserDao();
    	 return dao.getUserByUsername(OwnerEmail);
     }
     
     public String getName(){
    	 return name;
     }
     
     public void setName(String value){
    	 name = value;
     }
     
     public String getDescription(){
    	 return description;
     }
     
     public void setDescription(String value){
    	 description = value;
     }
     
     public String getLocation(){
    	 return location;
     }
     
     public void setLocation(String value){
    	 location = value;
     }
     
     public int getNumPositions(){
    	 return numPositions;
     }
     
     public void setNumPositions(int value){
    	 numPositions = value;
     }
     
     public int getNumPositionsRemaining(){
    	 return numPositionsRemaining;
     }
     
     public void setNumPositionsRemaining(int value){
    	 numPositionsRemaining = value;
     }

     public Skill[] getSkills(){
         return skills;
     }
     
     public void setInterests(Skill[] value){
          skills = value;
     }
	/**
	 * @return the ownerEmail
	 */
	public String getOwnerEmail() {
		return OwnerEmail;
	}
	/**
	 * @param ownerEmail the ownerEmail to set
	 */
	public void setOwnerEmail(String ownerEmail) {
		OwnerEmail = ownerEmail;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	/**
	 * @return the dateTime
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}
	/**
	 * @param startDateTime the dateTime to set
	 */
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getOrganizationName() {
		if(organizationName == null)
			organizationName = getPartner().getOrganizationName();
		
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}
	public Date getTime1(){
		return this.getStartDateTime();
	}
	public void setTime1(Date value){
		this.setStartDateTime(value);
	}
	public Date getTime2(){
		return this.getEndDateTime();
	}
	public void setTime2(Date value){
		this.setEndDateTime(value);
	}
}
