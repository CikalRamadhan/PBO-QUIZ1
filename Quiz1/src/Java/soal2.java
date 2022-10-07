package Java;

public class soal2 {
    public static void main(String[] args) {
        int a1 = 9 , b1 = 30 , c1 = 40;
        int a2 = 11, b2 = 35 , c2 = 38;
        int pulsa = 150;
        int jumlahdetik1, jumlahdetik2, totaldetik, sisadetik, a3,b3,c3;
        int biayatelponperdetik, pemakaianpulsa, sisadetiktelpon, biayapersisadetik;
        int biayatelponperpulsa, biayatelpon;

        System.out.println("Menghitung biaya telpon \n");
        System.out.println("J = jam");
        System.out.println("J mulai ="+ a1+ " : "+ b1 +" : "+ c1);
        System.out.println("J selesai ="+ a2+ " : "+ b2 +" : "+ c2);

        jumlahdetik1 = ((a1*3600) + (b1*60)+c1);
        jumlahdetik2 = ((a2*3600) + (b2*60)+c2);
        totaldetik = jumlahdetik2 - jumlahdetik1;
        a3 = totaldetik/3600;
        sisadetik = totaldetik%3600;
        b3 = sisadetik/60;
        c3 = sisadetik%60;

        biayatelponperdetik = 150/5;
        pemakaianpulsa = totaldetik/5;
        sisadetiktelpon = totaldetik%5;
        biayapersisadetik = sisadetiktelpon*biayatelponperdetik;
        biayatelponperpulsa = pemakaianpulsa*150;
        biayatelpon = biayatelponperpulsa+biayapersisadetik;

        System.out.println("\n Lama Percakapan = "+a3+ " : "+b3+ " :");
        System.out.println("Pemakaian Pulsa = "+pemakaianpulsa+"\n");
        System.out.println("Biaya Telpon = "+biayatelpon);


    }
}