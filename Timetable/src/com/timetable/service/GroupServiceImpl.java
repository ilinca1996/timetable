package com.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timetable.dao.GroupDAO;
import com.timetable.model.Group;
import com.timetable.model.Student;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	private GroupDAO groupDAO;
	
	@Override
	@Transactional
	public List<Group> getGroups() {
		return groupDAO.getGroups();
	}

	@Override
	@Transactional
	public void saveGroup(Group group) {
		group.setYear(1);
		groupDAO.saveGroup(group);
	}

}
