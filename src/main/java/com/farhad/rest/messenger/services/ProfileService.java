package com.farhad.rest.messenger.services;
import java.util.*;
import com.farhad.rest.messenger.database.DatabaseClass;
import com.farhad.rest.messenger.model.Profile;

public class ProfileService {
		
	Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("Farhad", new Profile(1, "farhad profile","Farhad","Nasimi"));
		profiles.put("Tom", new Profile(2, "Tommy profile","Tom","Corker"));
	}
	
	public List<Profile> getProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
}
