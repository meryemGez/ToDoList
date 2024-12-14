import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
        private String açıklama;
        private boolean tamamlandı;

        public ToDoList(String aciklama){
            this.açıklama=aciklama;
            this.tamamlandı=false;
        }
        public String getteraçıklama(){ //getter sınıfın içindekini okumak private sınıflarına erişmek için
            return açıklama;
        }
        public void setteraçıklama(String aciklama){ //setter açıklamayı değiştirmek private sınıfı içindeki örnek
            this.açıklama=aciklama;
        }
        public boolean vazifetamamlandı(){ //işin tamamlanıp tamamlanmadığı için
            return tamamlandı;
        }
        public void settertamamlandı(boolean tamamlandi){ //tamamlanmış olarak işareti değiştirir veya tersi
            this.tamamlandı=tamamlandi;
        }
    public String toString() {
        return "Görev: " + açıklama + ", Tamamlandı mı: " + (tamamlandı ? "Evet" : "Hayır");
}

public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<ToDoList> gorevler = new ArrayList<>();
        int secim;

        do{
            System.out.println("\n ***Yapılacaklar Listesi***");
            System.out.println("1. Görev Ekleyiniz");
            System.out.println("2. Görevlerimi Listele");
            System.out.println("3. Tamamlanan görev işretle");
            System.out.println("4. Görev Sil");
            System.out.println("5. Görev Güncelle");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine(); // böyle bir şey ekledim ki sondaki karakter silinsin

            switch(secim){
                case 1:
                    System.out.print("Görevinizin Açıklaması: ");
                    String aciklama = scanner.nextLine();
                    gorevler.add(new ToDoList(aciklama));
                    System.out.println("Görev eklemesi gerçekleşti");
                    break;

                    case 2:
                        System.out.println("\n ***Görev Listesi***");
                        if(gorevler.isEmpty()){
                            System.out.println("Göreviniz bulunmuyor, lütfen ekleme yapınız.");
                    }else {
                            for(int i = 0; i<gorevler.size(); i++){
                                System.out.println(gorevler.get(i).toString());
                            }
                    }
                    break;
                        case 3:
                            System.out.println("\nTamamlanacak görevi seçin");
                            for(int i = 0; i<gorevler.size(); i++){
                                System.out.println(gorevler.get(i).toString());
                            }
                            int gorevNo = scanner.nextInt();
                            if(gorevNo > 0 && gorevNo <= gorevler.size()) { //burayı çözerken anam ağladı
                                gorevler.get(gorevNo - 1).settertamamlandı(true);
                                System.out.println("Tamamlanan göreviniz işaretlendi!");
                            }
                            break;

                            case 4:
                                System.out.println("\nSilmek istediğiniz görevin numarası:");
                                for(int i = 0; i<gorevler.size(); i++) {
                                    System.out.println(gorevler.get(i).toString());
                                }
                                int silinecekNo = scanner.nextInt();
                                if (silinecekNo > 0 && silinecekNo <= gorevler.size()) {
                                    gorevler.remove(silinecekNo - 1);
                                    System.out.println("Görev silindi");
                                }else{
                                    System.out.println("Girdiğiniz numaraya atanan veri bulunmamaktadır");
                                    }
                                break;

                                case 5:
                                    System.out.println("\nGüncellenecek görev numarası nedir? : ");
                                    for(int i = 0; i<gorevler.size(); i++) {
                                        System.out.println(gorevler.get(i).toString());
                                    }
                                    int guncellenecekNo = scanner.nextInt();
                                    scanner.nextLine();//karakter temizlemesi yapsın satırın sonundan diye koydum
                                    if (guncellenecekNo > 0 && guncellenecekNo <= gorevler.size()) {
                                        System.out.println("Yeni açıklama girin : ");
                                        String yeniAciklama = scanner.nextLine();
                                        gorevler.get(guncellenecekNo - 1).setteraçıklama(yeniAciklama);
                                        System.out.println("Görev güncellenmiştir");
                                    }else {
                                        System.out.println("Geçersiz görev numarası!");
                                    }
                                    break;

                                    case 6:
                                        System.out.println("Programdan ayrılıyorsunuz...");
                                        break;

                                        default:
                                            System.out.println("Lütfen geçerli bir seçim yapınız.");
                                    }
        }while (secim !=6);

        scanner.close();
                        }

}

