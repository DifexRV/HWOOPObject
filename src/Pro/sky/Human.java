package Pro.sky;

import java.util.Arrays;

public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        jobTitle = "Должность";
    }

    Human(String name, int yearOfBirth, String town, String jobTitle) {

        if (name == null || name.isEmpty()) {
            this.name = "«Информация не указана»";
        } else {
            this.name = name;
        }

        this.yearOfBirth = yearOfBirth;
        if (town == null || town.isEmpty()) {
            this.town = "«Информация не указана»";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "«Информация не указана»";
        } else {
            this.jobTitle = jobTitle;
        }


    }

    public String getName() {
        return this.name = name;
    }

    public int getYearOfBirth() {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        return yearOfBirth;
    }

    public String getTown() {
        return this.town = town;
    }

    public String getJobTitle() {
        return this.jobTitle = jobTitle;
    }

    public String toString() {

        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю в должности " + getJobTitle() + " Будем знакомы!";

    }

}
