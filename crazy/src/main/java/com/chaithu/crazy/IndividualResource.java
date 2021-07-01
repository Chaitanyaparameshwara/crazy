package com.chaithu.crazy;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("individual")
public class IndividualResource {

	IndividualRepository in=new IndividualRepository();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Individual> getIndividual()
	{
		
		System.out.println("individual called");
		return in.getIndividual();
	}
	
	@GET
	@Path("i/{id}")
	public Individual createIndividual(@PathParam("id") int id )
	{
		return in.getIndividualC(id);
	 
	}
	
}
