package com.candidate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candidate.model.CandidateRequest;
import com.candidate.model.CandidateResponse;
import com.candidate.service.CandidateService;

@RequestMapping("/interview")
@RestController
public class CandidateController {
	
	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/candidates")
	public CandidateResponse createCandidate(@RequestBody CandidateRequest candidateRequest){
		return candidateService.addCandidate(candidateRequest);
	}
	
	@GetMapping("/candidates")
	public List<CandidateResponse> getCandidates(){
		return candidateService.getCandidates();
	}

	@GetMapping("/candidates/{id}")
	public CandidateResponse getCandidate(@PathVariable String id){
		return candidateService.getCandidate(Integer.valueOf(id));
	}
	
}
