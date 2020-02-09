package com.timetable.dao;

import java.util.List;

import com.timetable.model.Group;
import com.timetable.model.Student;

public interface GroupDAO {

	List<Group> getGroups();

	void saveGroup(Group group);

}
