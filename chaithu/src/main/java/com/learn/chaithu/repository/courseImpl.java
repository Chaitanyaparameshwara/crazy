package com.learn.chaithu.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.chaithu.entity.course;
@Service
public class courseImpl implements courseService {

	List<course> jk;
	public courseImpl() 
	{
		jk=new ArrayList<>();
		jk.add(new course(1, 'c'));
		jk.add(new course(2,'c'));
		
	}
	
	@Override
	public List<course> getCourse() 
	{
		
System.out.println("hehe");
return jk;
	}

	public course getC(int id) {
		
		//course c=null;
		for(course chai: jk)
		{
			if(chai.getId()==id)
			{
				return chai;
			}
		}
		return null;
	}

}
