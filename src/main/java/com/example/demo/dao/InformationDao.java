package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Information;

@Repository
public class InformationDao {

	private MongoOperations mongoOperations;
	
	@Autowired
	public InformationDao(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}
	
	public Information getInformation() {
		Query query = new Query();
		query.with(new Sort(Sort.Direction.DESC, "effectiveDate"));
		query.limit(1);
		List<Information> information = mongoOperations.find(query, Information.class);
		if(information.size()>0) {
			return information.get(0);	
		}else {
			return null;
		}
	}
	
	public void saveInformation(Information information) {
		mongoOperations.save(information);
	}
	
}