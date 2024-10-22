package java.array.kasus1;
import java.util.*;
import java.util.stream.*;

public class RataRataNilaiKelas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan jumlah siswa",':');
        int studentAmount = Integer.parseInt(input.nextLine());
        double[] studentGrade = new double[studentAmount];
        for (int i = 0; i < studentAmount; i++)
        {
            System.out.printf("%-30s%c%d%-2c","Masukkan nilai siswa ke",'-',(i + 1),':');
            studentGrade[i] = Double.parseDouble(input.nextLine());
        }
        input.close();
        Arrays.sort(studentGrade);
        for (int i = 0; i < studentGrade.length; i++)
        {
            System.out.printf("%-30s%-2c%.3f","Nilai siswa",':',studentGrade[i]);
            if (studentGrade.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}