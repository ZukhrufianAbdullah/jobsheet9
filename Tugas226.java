import java.util.Scanner;

public class Tugas226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklrasi variabel
        String nama, namaKampus, jenisOlahraga = "";
        String daftarAtletBadminton = "";
        String daftarAtletTenisMeja = "";
        String daftarAtletVoli = "";
        String daftarAtletBasket = "";

        //Perulangan paling luar
        do {
            System.out.print("Masukkan nama Politeknik (Ketik 'batal' untuk berhenti): ");
            namaKampus = sc.nextLine();

            //Menghentikan program jika input 'batal'
            if (namaKampus.equalsIgnoreCase("batal")) {
                System.out.println("Program dihentikan");
                break;
            }

            //Perulangan kedua
            for (int jnisOlahraga = 1; jnisOlahraga <= 4; jnisOlahraga++){
                //Menyimpan nama atlet dalam string yang sesuai
                switch (jnisOlahraga) {
                    case 1:
                        jenisOlahraga = "Badminton";
                        break;
                    case 2:
                        jenisOlahraga = "Tenis Meja";
                        break;
                    case 3:
                        jenisOlahraga = "Voli";
                        break;
                    case 4:
                        jenisOlahraga = "Basket";
                        break;
                }
                System.out.println("Input nama atlet " + jenisOlahraga);

                //Perulangan terdalam
                for (int j = 1; j <= 5; j++){
                    System.out.print("Masukkan nama atlet ke " + j + ": ");
                    nama = sc.nextLine();
                    //Menyimpan jenis olahraga dalam string yang sesuai
                    switch (jnisOlahraga){
                        case 1:
                            daftarAtletBadminton += nama + ", ";
                            break;
                        case 2:
                            daftarAtletTenisMeja += nama + ", ";
                            break;
                        case 3:
                            daftarAtletVoli += nama + ", ";
                            break;
                        case 4:
                            daftarAtletBasket += nama + ", ";
                            break;
                    }
                }
            }
            //Output daftar nama atlet per kampus yang dikelompokkan berdasarkan jenis olahraga
            System.out.println("\nDaftar nama atlet " + namaKampus + ":");
            System.out.println("Badminton: " + daftarAtletBadminton);
            System.out.println("Tenis Meja: " + daftarAtletTenisMeja);
            System.out.println("Voli: " + daftarAtletVoli);
            System.out.println("Basket: " + daftarAtletBasket);
            System.out.println();
        }while(true);
    }
}