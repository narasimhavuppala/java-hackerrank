package com.company.datastructures.stack;


public class StudentStackApp {

    IStack<Student> studentDynamicStack = new DynamicStack<>();

    public static void main(String[] args) {

        StudentStackApp studentStackApp = new StudentStackApp();

        studentStackApp.createStacks();
        studentStackApp.popStacks();
    }

    private void createStacks() {

        Student student1 = new Student("John Doe");
        Student student2 = new Student("Moris Lol");
        Student student3 = new Student("Roy Moke");

        studentDynamicStack.push(student1);
        studentDynamicStack.push(student2);
        studentDynamicStack.push(student3);


        System.out.println("Peek a student: " + studentDynamicStack.peek());
        System.out.println("Number of Student(s): " + studentDynamicStack.size());
    }

    private void popStacks() {

        studentDynamicStack.pop();
        studentDynamicStack.pop();
        studentDynamicStack.pop();

        System.out.println("Number of Student(s): " + studentDynamicStack.size());
    }

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }
}
