public class Method2 {
    public static void main(String[] args) {
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam=topla2(5,6,87,7,8,5,1,4,96,8);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    private static int topla2(int... sayilar) {
        int toplam = 0;
        for (int i : sayilar) {
            toplam = toplam + i;
        }
        return toplam;
    }

    private static String sehirVer() {
        return "Ankara";
    }
}
