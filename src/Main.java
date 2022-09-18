import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenler Olusturuldu
        double math, physics, chemistry, turkish, history, music;
        double kalmaNotu = 50;

        // Scanner tanimlandi
        Scanner inp = new Scanner(System.in);

        // Kullanicidan veri al

        System.out.println("Matematik Sınavı Notunuz? :");
        math = inp.nextDouble();

        System.out.println("Fizik Sınavı Notunuz? :");
        physics = inp.nextDouble();

        System.out.println("Kimya Sınavı Notunuz? :");
        chemistry = inp.nextDouble();

        System.out.println("Türkçe Sınavı Notunuz? :");
        turkish = inp.nextDouble();

        System.out.println("Tarih Sınavı Notunuz? :");
        history = inp.nextDouble();

        System.out.println("Müzik Sınavı Notunuz? :");
        music = inp.nextDouble();

        // Topla ve ortalama al

        double toplam = (math + physics + chemistry + turkish + history + music);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız : " + sonuc);
        boolean kalmaKosulu = sonuc <= kalmaNotu;

        String bitis = (kalmaKosulu) ? ("Kaldiniz ):") : ("Gectiniz :)");
        System.out.println(bitis);
    }
}