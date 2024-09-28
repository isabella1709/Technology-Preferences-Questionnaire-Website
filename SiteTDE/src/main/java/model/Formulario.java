package model;

import java.lang.invoke.StringConcatFactory;
import java.util.zip.DataFormatException;

public class Formulario {
    private String nome;
    private String birth_date;
    private String gender;
    private String marital_status;
    private String education_level;
    private String favorite_language;
    private String favorite_area;
    private String favorite_library;
    private String favorite_ide;
    private String favorite_practice;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getFavorite_language() {
        return favorite_language;
    }

    public void setFavorite_language(String favorite_language) {
        this.favorite_language = favorite_language;
    }

    public String getFavorite_area() {
        return favorite_area;
    }

    public void setFavorite_area(String favorite_area) {
        this.favorite_area = favorite_area;
    }

    public String getFavorite_library() {
        return favorite_library;
    }

    public void setFavorite_library(String favorite_library) {
        this.favorite_library = favorite_library;
    }

    public String getFavorite_ide() {
        return favorite_ide;
    }

    public void setFavorite_ide(String favorite_ide) {
        this.favorite_ide = favorite_ide;
    }

    public String getFavorite_practice() {
        return favorite_practice;
    }

    public void setFavorite_practice(String favorite_practice) {
        this.favorite_practice = favorite_practice;
    }

    public Formulario(String nome, String birth_date, String gender, String marital_status,
                      String education_level, String favorite_language, String favorite_area,
                      String favorite_library, String favorite_ide, String favorite_practice) {
        this.nome = nome;
        this.birth_date = birth_date;
        this.gender = gender;
        this.marital_status = marital_status;
        this.education_level = education_level;
        this.favorite_language = favorite_language;
        this.favorite_area = favorite_area;
        this.favorite_library = favorite_library;
        this.favorite_ide = favorite_ide;
        this.favorite_practice = favorite_practice;
    }
}
