# 📌 Reddit Duygu Analizi (Sentiment Analysis)

Bu proje, Reddit’ten belirli subredditlerden gönderileri çekerek duygu analizi yapar ve sonuçları pasta grafiği ile görselleştirir. **Java**, **Jsoup**, **JFreeChart** ve **Swing** kullanılarak geliştirilmiştir.

## 📚 İçindekiler
- [Genel Bakış](#genel-bakış)
- [Özellikler](#özellikler)
- [Kullanılan Teknolojiler](#kullanılan-teknolojiler)
- [Kod Açıklamaları](#kod-açıklamaları)
- [Ekran Görüntüleri](#ekran-görüntüleri)
- [Teşekkürler](#teşekkürler)
- [Yazar](#yazar)

---

## 🔍 Genel Bakış
Bu proje, Reddit API’sinden gönderileri çekerek duygu analizi yapmaktadır. Analiz edilen veriler **pozitif**, **negatif** veya **nötr** olarak sınıflandırılır ve sonuçlar bir **pasta grafiği** ile görselleştirilir.

---

## 🚀 Özellikler
- Reddit'ten belirlenen subredditlerden **1500 gönderi** çeker.
- Gönderileri **pozitif, negatif veya nötr** olarak sınıflandırır.
- Sonuçları **pasta grafiği** ile gösterir.

---

## 🛠 Kullanılan Teknolojiler
- **Java**: Proje ana dili
- **Jsoup**: Reddit’ten veri çekmek için kullanıldı.
- **JSON**: API’den gelen verileri işlemek için kullanıldı.
- **JFreeChart**: Analiz sonuçlarını grafik olarak göstermek için kullanıldı.
- **Swing**: Grafik arayüzü oluşturmak için kullanıldı.

---

## 📝 Kod Açıklamaları

### 📌 1. RedditScraper.java (Reddit'ten veri çekme)
- **Jsoup** kütüphanesi ile Reddit’in JSON API’sinden veri çekilir.
- **JSONObject ve JSONArray** ile JSON verisi ayrıştırılır.
- Reddit gönderileri bir **List** içinde saklanır.
- Reddit API’sine **User-Agent** eklenerek erişim engellenmesi önlenir.

### 📌 2. SentimentAnalyzer.java (Duygu Analizi)
- **Pozitif** ve **Negatif** kelimeler belirlenmiştir.
- Gönderi metni kelimelere ayrılır ve pozitif/negatif kelimelerle karşılaştırılır.
- **Daha fazla pozitif kelime varsa** → *Pozitif*  
- **Daha fazla negatif kelime varsa** → *Negatif*  
- **Eşit veya hiçbiri yoksa** → *Nötr*  

### 📌 3. SentimentChart.java (Grafik Çizimi)
- **JFreeChart** ile pasta grafiği oluşturulur.
- **Pozitif** → *Yeşil*, **Negatif** → *Kırmızı*, **Nötr** → *Sarı* olarak renklendirilir.

### 📌 4. RedditSentimentAnalysis.java (Ana Çalıştırma Sınıfı)
Bu sınıf, tüm süreci yönetir:
- **RedditScraper** sınıfını kullanarak Reddit’ten gönderileri çeker.
- **SentimentAnalyzer** ile her gönderinin duygu analizini yapar.
- **Sonuçları ekrana yazdırır** (Pozitif, Negatif, Nötr olarak).
- **SentimentChart** ile bir grafik oluşturarak sonucu görselleştirir.

---

## 📸 Ekran Görüntüleri

![image](https://github.com/user-attachments/assets/f0da50ef-51f3-4947-b8ba-d61a086eaeab)
- **RedditScraper** sınıfı ile veriler çekildi.


![image](https://github.com/user-attachments/assets/66cf35f9-fa43-43c3-954d-601f5fceadfc)
- Çekilen verilerin duygu analizi gerçekleşti.


![image](https://github.com/user-attachments/assets/131e8904-9cd0-4d57-af22-29b907d256cb)
- Verilere ait pasta grafiği oluştu.


---
## 🎉 Teşekkürler
Bu projeyi geliştirirken bana yardımcı olan kaynaklar ve topluluklara teşekkür ederim!

---

## ✨ Yazar
👤  **[AYÇA ALBAYRAK](https://github.com/aycaalbayrak)**     

