package cn.lucasma.design.pattern.behavioral.iterator;

/**
 * Created by lucas.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
