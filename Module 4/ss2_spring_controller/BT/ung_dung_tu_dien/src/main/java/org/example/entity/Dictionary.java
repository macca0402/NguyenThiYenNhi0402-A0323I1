package org.example.entity;

public class Dictionary {
    String wordEnglish;
    String wordVietNam;

    public String getWordEnglish() {
        return wordEnglish;
    }

    public void setWordEnglish(String wordEnglish) {
        this.wordEnglish = wordEnglish;
    }

    public String getWordVietNam() {
        return wordVietNam;
    }

    public void setWordVietNam(String wordVietNam) {
        this.wordVietNam = wordVietNam;
    }

    public Dictionary(String wordEnglish, String wordVietNam) {
        this.wordEnglish = wordEnglish;
        this.wordVietNam = wordVietNam;
    }

    public Dictionary() {
    }
}
