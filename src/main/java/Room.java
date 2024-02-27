public class Room {
    private int maxRoomSize;
    private String id;

    private int numberOfStudents;
    private Student[] students;

    public Room(int maxRoomSize, String id, Student[] students) {
        this.maxRoomSize = maxRoomSize;
        this.id = id;

        this.students = new Student[getMaxRoomSize()];

        for (int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
        this.numberOfStudents = students.length;
    }
    public void enterRoom(Student student){
        if(numberOfStudents < maxRoomSize) {
            students[numberOfStudents++] = student;
        }else{
            System.out.println("НЕТ МЕСТ!!!");
        }
    }
    public void exitRoom(Student student) {
        int exitNumber = -1;

        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] == student) exitNumber = i;
        }

        if (exitNumber != -1) {
            for (int i = exitNumber; i < numberOfStudents ; i++) {
                students[i] = students[i+1];
            }
            students[numberOfStudents--] = null;
        } else {
            System.out.println("Нет такого студента!");
        }
    }
    public int getMaxRoomSize() {
        return maxRoomSize;
    }
    public String getId() {
        return id;
    }
    public Student[] getStudents() {
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
