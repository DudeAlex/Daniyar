public class Main {
    public static void main(String[] args) {
        Student Aaa = new Student(1, "Aaa");
        Student Baa = new Student(2, "Baa");
        Student Caa = new Student(3, "Caa");
        Student Daa = new Student(4, "Daa");

        Student Eaa = new Student(5, "Eaa");

        Student[] students = {Aaa,Baa,Caa,Daa};

        Room room1 = new Room(10, "I.1.15", students);
        room1.enterRoom(Eaa);

        room1.exitRoom(Caa);
        room1.exitRoom(Aaa);
        room1.enterRoom(Aaa);

        int numStud = room1.getNumberOfStudents();
        Student[] studs = room1.getStudents();

        for (int i = 0; i < numStud; i++) {
            System.out.println(studs[i].getName());
        }

    }
}
