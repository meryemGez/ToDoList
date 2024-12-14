import java.util.*;
public class Main {
        private String açıklama;
        private boolean tamamlandı;

        public Main(String aciklama){
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
}
