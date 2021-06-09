import javax.swing.JOption;

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

        System.out.println("Nama Depan : " + namaDepan);
        System.out.println("Nama Tengah : " + namaTengah);
        System.out.println("Nama Belakang :"+ namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO " + nilaiAbjad);
        System.err.println("Tampan :" + tampan );

        JOptionPane.showMessageDialog(null,"Hai," + namaDepan + namaTengah + namaBelakang);
        
    }
}