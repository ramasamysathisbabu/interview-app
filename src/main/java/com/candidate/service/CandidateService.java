package com.candidate.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.candidate.model.CandidateRequest;
import com.candidate.model.CandidateResponse;

@Service
public class CandidateService {

	private List<CandidateResponse> candidateList = populateCandidates();
	
	public List<CandidateResponse> getCandidates(){
		return candidateList;
	}

	public CandidateResponse getCandidate(int candidateId){
		return candidateList.stream().filter(candidate -> candidate.getCandidateId() == candidateId).findFirst().get();
	}
	
	public CandidateResponse addCandidate(CandidateRequest candidateRequest){
		CandidateResponse newCandidate = addCandidateRequest(candidateRequest);
		candidateList.add(newCandidate);
		return newCandidate;
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
	
	private CandidateResponse addCandidateRequest(CandidateRequest candidateRequest){
		CandidateResponse candidateResponse = new CandidateResponse();
		
		candidateResponse.setFirstName(candidateRequest.getFirstName());
		candidateResponse.setLastName(candidateRequest.getLastName());
		candidateResponse.setMiddleName(candidateRequest.getMiddleName());
		candidateResponse.setEmailAddress(candidateRequest.getEmailAddress());
		CandidateResponse maxCandidateId = candidateList.stream().max(Comparator.comparingInt(CandidateResponse::getCandidateId)).get();
		candidateResponse.setCandidateId(maxCandidateId.getCandidateId() + 1);
		return candidateResponse;
	}
}
