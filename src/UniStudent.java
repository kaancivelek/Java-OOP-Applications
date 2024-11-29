
    abstract class UniStudent {
        int studentNo;
        String studentName;
        String studentSurname;
        String startingDate;
        String Faculty;
        String Department;

        public UniStudent(int studentNo, String studentName, String studentSurname, String startingDate, String Faculty) {
            this.studentNo = studentNo;
            this.studentName = studentName;
            this.studentSurname = studentSurname;
            this.startingDate = startingDate;
            this.Faculty = Faculty;
        }

        public abstract String departmantInformation();

        public abstract void showStudentInformations();
    }


    class SoftwareEngineering extends UniStudent {
        public SoftwareEngineering(int studentNo, String studentName, String studentSurname, String startingDate) {
            super(studentNo,studentName,studentSurname,startingDate,"Engineering Faculty");
        }
        @Override
        public String departmantInformation() {
            return "Software Engineering";
        }
        @Override
        public void showStudentInformations() {
            System.out.println("Student Name: " + studentName+ " Surname: " + studentSurname+" Department: " + departmantInformation());
        }
    }

    class MechanicalEngineering extends UniStudent {
        public MechanicalEngineering(int studentNo, String studentName, String studentSurname, String startingDate) {
            super(studentNo,studentName,studentSurname,startingDate,"Engineering Faculty");
        }
        @Override
        public String departmantInformation() {
            return "Mechanical Engineering";
        }
        @Override
        public void showStudentInformations() {
            System.out.println("Student Name: " + studentName+ "Surname: " + studentSurname+"Department: " + departmantInformation());
        }
    }

    class MechatronicEngineering extends UniStudent {
        public MechatronicEngineering(int studentNo, String studentName, String studentSurname, String startingDate) {
            super(studentNo,studentName,studentSurname,startingDate,"Engineering Faculty");
        }
        @Override
        public String departmantInformation() {
            return "Mechatronic Engineering";
        }
        @Override
        public void showStudentInformations() {
            System.out.println("Student Name: " + studentName+ "Surname: " + studentSurname+"Department: " + departmantInformation());
        }
    }

    class EnergySystemsEngineering extends UniStudent {
        public EnergySystemsEngineering(int studentNo, String studentName, String studentSurname, String startingDate) {
            super(studentNo,studentName,studentSurname,startingDate,"Engineering Faculty");
        }
        @Override
        public String departmantInformation() {
            return "Energy Systems Engineering";
        }
        @Override
        public void showStudentInformations() {
            System.out.println("Student Name: " + studentName+ "Surname: " + studentSurname+"Department: " + departmantInformation());
        }
    }

    class ElectricalEngineering extends UniStudent {
        public ElectricalEngineering(int studentNo, String studentName, String studentSurname, String startingDate) {
            super(studentNo,studentName,studentSurname,startingDate,"Engineering Faculty");
        }
        @Override
        public String departmantInformation() {
            return "Electrical Engineering";
        }
        @Override
        public void showStudentInformations() {
            System.out.println("Student Name: " + studentName+ "Surname: " + studentSurname+"Department: " + departmantInformation());
        }
    }




