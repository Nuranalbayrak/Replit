package constructors;

import java.util.Scanner;

public class C01_Constructor {
   /*
    İki kişilik bir Scrabble Oyunu yaz
    Tüzük
    OK== 1- Başlangıçta İlk Oyuncuya sor Oyunu başlatmak için bir kelime girin
    Tamam 2- Daha sonra oyuncuyu değiştirin, verilen kelimenin geçerli olup olmadığını yeni oyuncuya sorun
    Tamam i) Yeni oyuncu verilen kelimeyi kabul ederse, kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
    Tamam ii) Yeni oyuncu kelimeyi geçerli olarak kabul etmezse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin

    OK 3- Kullanıcılara oyuna devam etmek isteyip istemediğini sorun
    Tamam i) Oyuncu devam etmek istiyorsa,
    Tamam, kullanıcıdan kelimeye eklemek için bir harf isteyin
    Tamam ve kullanıcı tarafından eklemesini isteyin (başlangıç veya bitiş)
    Tamam, sonra kelimeye harf ekleyin ve 2. adımı çalıştırın

    Tamam ii) Oyuncu devam etmek istemiyorsa
    sonra "Oyun Bitti" yazdırın ve puanları ve kazananı yazdırın
    */
   public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
       System.out.println("oyunu baslatmak icin bir kelime giriniz");
       String k1=input.nextLine();


}}
