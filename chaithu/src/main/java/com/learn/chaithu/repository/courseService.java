package com.learn.chaithu.repository;

import java.util.List;

import com.learn.chaithu.entity.course;

public interface courseService {

	List<course> getCourse();
	course getC(int id);
}
