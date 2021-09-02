import java.util.HashMap;
import java.util.Scanner;

public class Organization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, Employee> myOrg = new HashMap<Integer, Employee>();

        Employee employee = new Employee();

        System.out.println("Add employees? Please type 1 for YES or 2 for NO");
        int answer = input.nextInt();
        while (answer == 1) {
            System.out.println("Enter employee ID:");
            int id = input.nextInt();
            employee.setId(id);
            input.nextLine();

            System.out.println("Enter employee Name:");
            String name = input.nextLine();
            employee.setName(name);


            System.out.println("Enter employee Age:");
            int age = input.nextInt();
            employee.setAge(age);
            input.nextLine();

            System.out.println("Enter employee Gender:");
            String gender = input.nextLine();
            employee.setGender(gender);

            System.out.println("Enter employee Department:");
            String depart = input.nextLine();
            employee.setDepartment(depart);

            System.out.println("Enter employee Job:");
            String job = input.nextLine();
            employee.setJobTitle(job);

            System.out.println("You have successfully added the employee with the id " + employee.getId() + " and the following personal informations: \nName: " + employee.getName() + "\nAge: " + employee.getAge() + "\nGender: " + employee.getGender() + "\nDepartment: " + employee.getDepartment() + "\nJob Title: " + employee.getJobTitle());

            myOrg.put(employee.getId(), employee);
            System.out.println(" Your organization has  " + myOrg.size() + " employees");

            System.out.println("Add another employee? Press 1 for YES or 2 for NO");
            answer= input.nextInt();
            if (answer == 1) {
                continue;
            } else if (answer == 2) {
                System.out.println("Enter the ID of the user you want to delete:");
                int deleteid = input.nextInt();
                myOrg.remove(deleteid);
                System.out.println(" Your organization has  " + myOrg.size() + " employees");
            }
        }

    }
}