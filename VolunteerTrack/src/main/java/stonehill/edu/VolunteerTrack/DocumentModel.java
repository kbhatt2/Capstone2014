package stonehill.edu.VolunteerTrack;

import java.util.Date;
import java.util.*;
public class DocumentModel {
	
	String name;
	String type;
	Date dateUploaded;
	String link;
	String userEmail;
	boolean isSharedDocument;

public String getName()
{
	return name;
}

public void setName(String s)
{
	name=s;
}


public String getType()
{
	return type;
}

public void setType(String b)
{
type=b;	
}

public Date getDateUploaded()
{
	return dateUploaded;
}

public void setDateUploaded(Date d)
{
	dateUploaded=d;	
}

public String getLink()
{
	return link;
	
}

public void setLink(String l)
{
link=l;
}
public String getUserEmail()
{
	return userEmail;
}
public boolean getIsSharedDocument()
{
	return isSharedDocument;
}
public void setIsSharedDocument(boolean shared)
{
	isSharedDocument=shared;
}






}