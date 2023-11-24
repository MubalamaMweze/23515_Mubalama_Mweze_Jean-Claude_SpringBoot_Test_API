package com.StudentRegistration.StudentRegistration.repository;

import com.StudentRegistration.StudentRegistration.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
//    Course findByCourseDefinition_Id(UUID id);
//    List<Course> findBySemester_IdAndDepartment_Id(int depId, UUID semId);


}
