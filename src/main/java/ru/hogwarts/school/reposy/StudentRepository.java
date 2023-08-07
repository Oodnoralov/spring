package ru.hogwarts.school.reposy;

import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Student;

import java.util.Collection;


public interface StudentRepository extends JpaRepository<Student, Long> {
Collection<Student> findByAge(Long age);
}

