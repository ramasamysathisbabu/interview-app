package com.candidate.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.candidate.model.CandidateResponse;

@Service
public class CandidateService {

	private List<CandidateResponse> candidateList = populateCandidates();
	
	public List<CandidateResponse> getCandidates(){
		return candidateList;
	}
	
	@PostConstruct
	private List<CandidateResponse> populateCandidates() {
		List<CandidateResponse> candidates = new ArrayList<CandidateResponse>();
		
		for (int i = 1; i < 5 ; i++) {
			CandidateResponse candidateResponse = new CandidateResponse();
			candidateResponse.setCandidateId(i);
			candidateResponse.setFirstName("first name " + i);
			candidateResponse.setLastName("last name " + i);
			candidateResponse.setMiddleName("middle name " + i);
			candidates.add(candidateResponse);
		}
		return candidates;
	}
	
	
}
