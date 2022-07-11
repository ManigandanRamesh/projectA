package com.chainsys.springproject.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLc {
	public AnnotationLc() {
		System.out.println("AnnotationLc Object Created" + hashCode());
	}
	@PostConstruct
	public void start() {
		System.out.println("Start AnnotationLc...");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Stoped AnnotationLc...");
	}
	public void print() {
		System.out.println("print AnnotationLc called");
	}

}
