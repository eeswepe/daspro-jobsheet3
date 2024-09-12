import java.util.Scanner;

class SistemGaji {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double rateSalary, tax, bonus, salaryAndBonus, taxedSalary;
        int workHour;

        tax = 0.05;
        bonus = 0.1;

        System.out.print("Masukkan upah perjam: ");
        rateSalary = input.nextDouble();
        System.out.print("Masukkan jumlah jam kerja: ");
        workHour = input.nextInt();

        salaryAndBonus = (rateSalary * workHour) + (rateSalary * workHour * bonus);        
        taxedSalary = salaryAndBonus - (salaryAndBonus * tax);

        System.out.println("Gaji bersih yang anda terima adalah " + taxedSalary + " rupiah");
        
    }    
}
