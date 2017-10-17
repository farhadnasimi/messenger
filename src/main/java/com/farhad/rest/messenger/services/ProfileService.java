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
	
	public Profile getProfile(String profile){
		return profiles.get(profile);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size() + 1);
	    profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getId() <= 0){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public void removeProfile(Profile profile){
		profiles.remove(profile);
	}
}
