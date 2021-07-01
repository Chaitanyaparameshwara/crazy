package com.learn.chaithu.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.chaithu.entity.course;
import com.learn.chaithu.repository.courseImpl;

@RestController
public class learnController {
 //  
	@Autowired
	courseImpl ci;
	course c;
	@GetMapping("courses")
	public List<course> getCourse()
	{
		return ci.getCourse();
	}
	
	@GetMapping("c/{id}")
	public course getC(@PathVariable int id)
	{
		return ci.getC(id);
	}
	
}
