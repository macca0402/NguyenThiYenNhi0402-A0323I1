package org.example.model;
import java.util.List;
public class Email {
    int code;
    String language;
    int size;
    boolean enableSpamsFilter;
    String signature;

    public Email() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEnableSpamsFilter() {
        return enableSpamsFilter;
    }

    public void setEnableSpamsFilter(boolean enableSpamsFilter) {
        this.enableSpamsFilter = enableSpamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Email(int code, String language, int size, boolean enableSpamsFilter, String signature) {
        this.code = code;
        this.language = language;
        this.size = size;
        this.enableSpamsFilter = enableSpamsFilter;
        this.signature = signature;
    }
}
