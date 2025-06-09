package Task4;

import java.io.Serializable;

public class Group implements Serializable {
    private Student[] students;
    private String groupName;
    private int groupId;
    private Student leader;

    public Group(String groupName, int groupId, Student leader, Student[] students) {
        this.groupName = groupName;
        this.groupId = groupId;
        this.leader = leader;
        this.students = students;
    }

    public Group(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        this.leader = null;
        this.students = null;
    }

    public String getGroupName() { return groupName; }
    public int getGroupId() { return groupId; }
    public Student getLeader() { return leader; }
    public Student[] getStudents() { return students; }

    public void setGroupName(String groupName) { this.groupName = groupName; }
    public void setGroupId(int groupId) { this.groupId = groupId; }
    public void setLeader(Student leader) { this.leader = leader; }
    public void setStudents(Student[] students) { this.students = students; }
}
