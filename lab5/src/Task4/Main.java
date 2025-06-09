package Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = { new Student("Ivan", 101), new Student("Oksana", 102), new Student("Petro", 103) };
        Group group = new Group("IT-101", 1, students[0], students);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("lab5/src/Task4/group.dat"))) {
            out.writeObject(group);
            System.out.println("Serialized data has been saved");
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("lab5/src/Task4/group.dat"))) {
            Group group1 = (Group) in.readObject();

            System.out.println("Group: " + group1.getGroupName() + ", ID: " + group1.getGroupId());
            System.out.println("Leader: " + group1.getLeader().getName());

            System.out.println("Students:");
            for (Student s : group1.getStudents()) System.out.println(" - " + s.getName() + ", ID: " + s.getId());

        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }
}
