package com.timetable.service;

import java.util.List;

import com.timetable.model.Group;

public interface GroupService {

	List<Group> getGroups();

	void saveGroup(Group group);

}
