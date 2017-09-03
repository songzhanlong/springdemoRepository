package com.szl.demo.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	@Autowired
	private Student student;

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public void printStudent() {
		System.out.println(student.getName() + "'s age is " + student.getAge());
	}

}
