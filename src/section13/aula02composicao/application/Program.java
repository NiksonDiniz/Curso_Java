package section13.aula02composicao.application;

import section13.aula02composicao.entities.Department;
import section13.aula02composicao.entities.HourContract;
import section13.aula02composicao.entities.Worker;
import section13.aula02composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        //Relação "tem-um" ou "tem-vários"
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();

        Worker worker = new Worker(name,
                WorkerLevel.valueOf(level),
                salary,
                new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY):");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            worker.addContract(new HourContract(date, valuePerHour, duration));
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String date = sc.next();

        int month = Integer.parseInt(date.substring(0, 2));
        int year = Integer.parseInt(date.substring(3));

        worker.income(year, month);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + date + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
