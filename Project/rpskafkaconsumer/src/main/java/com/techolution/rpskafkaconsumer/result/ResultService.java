package com.techolution.rpskafkaconsumer.result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
public class ResultService {
	
	@Autowired
	private ResultRepository repo;
	
	public List<Result> getResults()
	{
		return repo.findAll();
	}
	
	public List<Result> getResults(Pageable p)
	{
		return repo.findAll(p).getContent();
	}
	
	//I'm sure there's a simpler way to get results by date using Pageable but keep this for now just in case
	public List<Result> getResultsByDate()
	{
		List<Result> r = repo.findAll();
		r.sort((Result r1, Result r2) -> {
			int i = r1.getTimestamp().compareTo(r2.getTimestamp());
			return i;
		});
		return r;
	}
	
	public Result getLast()
	{
		List<Result> r = getResults();
		if(r.isEmpty())
			return null;
		return r.get(r.size() - 1);
	}
}
