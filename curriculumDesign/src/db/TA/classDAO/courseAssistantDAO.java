package db.TA.classDAO;

import db.TA.class_.courseAssistant;

public interface courseAssistantDAO {
    public void addAssistant(courseAssistant assis);
    public void select_CourseAndStu(String t_id);
}
