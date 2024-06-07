package com.ey.q1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public interface AuthorService {
	public abstract Set<String> getUniqueSurnames(List<Author1> authorList);
	

	public abstract List<Author1> getAuthorsByCity(List<Author1> authorList,String city);
	
	public abstract double femaleAverageAge(List<Author1> authorList);
	
	public abstract Long getMobileByAdhar(List<Author1> authorList,Long adharCard);

}
class AuthorServiceImp1 implements AuthorService {
	
	public Set<String> getUniqueSurnames(List<Author1> authorList) {
		
		return authorList.stream().map(a1->a1.getSurname().toLowerCase()).collect(Collectors.toSet());
	}

	public List<Author1> getAuthorsByCity(List<Author1> authorList, String city) {
		return authorList.stream().filter(a->a.getCity().equals(city)).collect(Collectors.toList());
	}

	public double femaleAverageAge(List<Author1> authorList) {
		return authorList.stream().filter(a1->"female".equals(a1.getGender()))
				.mapToInt(a2->Period.between(a2.getBirthdate(), LocalDate.now()).getYears()).average().orElse(0);
	}

	public Long getMobileByAdhar(List<Author1> authorList, Long adharCard) {
		return authorList.stream().filter(author1->author1.getAdharCard().equals(adharCard)).map(Author1::getMobile).findFirst().orElse(null);	 
	}

}
	

