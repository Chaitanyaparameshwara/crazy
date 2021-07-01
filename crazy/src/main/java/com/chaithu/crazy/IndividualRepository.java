package com.chaithu.crazy;

import java.util.ArrayList;
import java.util.List;

public class IndividualRepository {

	
List<Individual> li;

public IndividualRepository()
{
	li=new ArrayList<>();
	Individual i1=new Individual();
	i1.id=1;
	i1.name="chaithu";
	i1.number=89;
	Individual i2=new Individual();
	i2.id=2;
	i2.name="chaithu";
	i2.number=89;
	li.add(i1);
	li.add(i2);
}

public List<Individual> getIndividual() {
	// TODO Auto-generated method stub
	return li;
}

public Individual getIndividualC(int id) {
	// TODO Auto-generated method stub
//	Individual i;
	
	for(Individual in: li)
	{
		if(in.getId()==id)
		{
			return in;
			
		}
	}
	return new Individual();
}
}


