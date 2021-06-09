import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
    public static void main(String[] args){

        String namaDepan ="Muhammad";
        String namaTengah ="Adyatma Rizky";
        String namaBelakang = "Subardjo";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.89765412;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        
        System.out.print("Input Nama Depan : ");
        namaDepan = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Input IPK : ");
        ipk = scanner.nextDouble();
        System.out.print("");
        System.out.print("Input Nilai Abjad : ");
        nilaiAbjad = scanner.next().charAT(0);
        System.out.print("Tampan? : ");
        tampan = scanner.nextBoolean();

        System.out.println("============ OUTPUT ==========");
        System.out.println("Nama Depan : " + namaDepan);
        System.out.println("Nama Tengah : " + namaTengah);
        System.out.println("Nama Belakang :"+ namaBelakang);
        System.out.print("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO " + nilaiAbjad);
        System.err.println("Tampan :" + tampan );

        JOptionPane.showMessageDialog(null,"Hai," + namaDepan + namaTengah + namaBelakang);
        
    }
}