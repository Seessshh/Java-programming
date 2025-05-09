package com.sushil.Scenario_based_programs;

public class EducationInstitute {

    Course[] courses ;
    Offer[] offers ;

    public EducationInstitute(Course[] courses, Offer[] offers) {
        this.courses = courses;
        this.offers = offers;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    public void enrollStudentCourse(int courseId, String studentName)
    {
        System.out.println(studentName+" has enrolled in the course: Mathematics"+courseId);
    }
}
