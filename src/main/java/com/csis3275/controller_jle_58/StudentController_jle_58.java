package com.csis3275.controller_jle_58;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.model_jle_58.DomesticStudent_jle_58;
import com.csis3275.model_jle_58.InternationalStudent_jle_58;
import com.csis3275.model_jle_58.Students_jle_58;

@Controller
@RequestMapping("/student")
public class StudentController_jle_58 {
	@RequestMapping(method = RequestMethod.GET)
	public String newProfile(ModelMap model) {
		Students_jle_58 student = new Students_jle_58();
		model.addAttribute("student", student);
		return "student_jle_58";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveProfile(Students_jle_58 student, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "student_jle_58";
		}
		
		Students_jle_58 newStudent;
		if (student.getTypeOfStudent().equals("International")) {
			newStudent = new InternationalStudent_jle_58();
		} else {
			newStudent = new DomesticStudent_jle_58();
		}
		
		newStudent.copyAttributes(student);
		
		model.addAttribute("successMessage", "Information of " + newStudent.getFirstName()
											+ " " + newStudent.getLastName() +",\n");
		model.addAttribute("student", newStudent);
		model.addAttribute("differentMessage", newStudent.toString());
		return "Assignment1View";
	}

	/* 
	 * Method used to populate the country list in view. Note that here you can call
	 * external systems to provide real data.
	 */
	@ModelAttribute("semester")
	public List<String> initSemester() {
		List<String> semester = new ArrayList<String>();
		semester.add("Fall");
		semester.add("Winter");
		semester.add("Summer");
		return semester;
	}
	
	@ModelAttribute("grade")
	public List<String> initGrade() {
		List<String> grade = new ArrayList<String>();
		grade.add("None");
		grade.add("A+");
		grade.add("A");
		grade.add("A-");
		grade.add("B+");
		grade.add("B");
		grade.add("B-");
		grade.add("C+");
		grade.add("C");
		grade.add("F");
		grade.add("W");
		grade.add("UN");
		
		return grade;
	}
}
