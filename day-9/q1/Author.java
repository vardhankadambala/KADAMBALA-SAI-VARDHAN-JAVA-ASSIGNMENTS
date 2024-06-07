package com.ey.q1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Author {
	public static void main(String[] args) {
		Author1[] a= {new Author1(1111l, "kadambala", "sai", "vardhan", LocalDate.of(2002, 6, 26), "male", "tekkali", 1234l),
				new Author1(2222l, "rao", "sasi", "kala", LocalDate.of(2002, 8, 6), "female", "kadapa", 5678l), 
				new Author1(3333l, "ravva", "raj", "kummar", LocalDate.of(2002, 8, 6), "male", "hyderabad", 1231l),
				new Author1(4444l, "ravva", "rudrama", "devi", LocalDate.of(2002, 8, 6), "female", "nellore", 1223l)};
		List<Author1> a1=new ArrayList<>(Arrays.asList(a));
		AuthorServiceImp1 as=new AuthorServiceImp1();
		System.out.println(as.getUniqueSurnames(a1));
		System.out.println(as.getAuthorsByCity(a1, "hyderabad"));
		System.out.println(as.femaleAverageAge(a1));
		System.out.println(as.getMobileByAdhar(a1,1111l));
	}
}
