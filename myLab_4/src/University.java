class University {
    String surname;
    String name;
    String group;
    int course;
    int age;

    University(String surname, String name, String group, int course, int age) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.course = course;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getGroup() {
        return group;
    }

    int getAge() {
        return age;
    }

    int getCourse() {
        return course;
    }

    public void print() {
        System.out.printf("%-5s %-6s group: %-3s course: %-3d age: %-3d",
                this.getSurname(),
                this.getName(),
                this.getGroup(),
                this.getCourse(),
                this.getAge());
        System.out.println();
    }
}
