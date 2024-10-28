import java.util.Scanner;

public class PolaPersegi526{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();

        //Validasi input agar minimal 3
        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
            return;
        }

        //Cetak persegi angka dengan bagian tengah kosong
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                //Kondisi untuk mencetak angka di bagian pinggir
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else{
                    System.out.print("  "); //Bagian tengah kosong
                }
            }
            System.out.println(); //Pindah baris
        }
    }
}