package com.example.offlinequizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestionsList> MatematikaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("12+9-7", "14", "15", "16", "17", "14", "");
        final QuestionsList question2 = new QuestionsList("2 ning kvadrati nechi", "7", "4", "8", "9", "4", "");
        final QuestionsList question3 = new QuestionsList("4 ning kvadrati nechi", "10", "15", "8", "16", "16", "");
        final QuestionsList question4 = new QuestionsList("20+5-4", "21", "15", "16", "17", "21", "");
        final QuestionsList question5 = new QuestionsList("40+9-1", "12", "48", "89", "56", "48", "");
        final QuestionsList question6 = new QuestionsList("Kesma deb nimaga aytiladi", "Ikki tomoni chegaralangan t'o'g'ri chiziq", "Hech qachon kesishmaydigan chiziq", "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "jhhjhj", "Ikki tomoni chegaralangan t'o'g'ri chiziq", "");
        final QuestionsList question7 = new QuestionsList("Matematik amallar nechta", "2", "3", "4", "5", "4", "");
        final QuestionsList question8 = new QuestionsList("Shaxodatxon", "shgvh", "jsdv", "ishfd", "dsuh", "dsuh", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        return questionsLists;
    }

    private static List<QuestionsList> InformatikaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("CTRL + Z komandasi nima vazifani bajaradi?", "Qaytish", "O'chirish", "Tozalash", "Bilmasam", "Qaytish", "");
        final QuestionsList question2 = new QuestionsList("CTRL + A komandasi nima vazifani bajaradi?", "Hammasini belgilash", "O'chirish", "Yoqotish", "screenshot", "Hammasini belgilash", "");
        final QuestionsList question3 = new QuestionsList("CTRL + C komandasi nima vazifani bajaradi?", "Copy", "Delete", "Screenshot", "Yoqish", "Copy", "");
        final QuestionsList question4 = new QuestionsList("Enter tugmasi nima vazifani bajaradi?", "Orqaga", "Keyingisi", "Tepaga", "Pastga", "Keyingisi", "");
        final QuestionsList question5 = new QuestionsList("WIN + R nega kerak", "Run oynasini ochish uchun", "Screenshot", "Ilovalar menusi", "Word dasturi", "Run oynasini ochish uchun", "");
        final QuestionsList question6 = new QuestionsList("Komputerni o'chirish tugmasi qaysi qatorda berilgan?", "Alt + F5", "Alt + F6", "Alt + F4", "Alt + F1", "Alt + F4", "");
        final QuestionsList question7 = new QuestionsList("Caps Loock tugmasi nima vazifani bajaradi", "Kichkina harfda yozish", "Dasturdan chiqish", "Kompyuterni o'chirish", "Katta harf bolan yozish", "Katta harf bolan yozish", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);

        return questionsLists;
    }

    private static List<QuestionsList> InglizTiliQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Apple so'zining manosi nima?", "Olma", "Anor", "Olcha", "Bexi", "Olma", "");
        final QuestionsList question2 = new QuestionsList("Search so'zining manosi nima", "Yozish", "Qidiruv", "O'qish", "Kitob", "Qidiruv", "");
        final QuestionsList question3 = new QuestionsList("Hello sir", "Salom Janob", "Salom Xola", "Salom Amaki", "Salom Ona", "Salom Janob", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        return questionsLists;

    }

    private static List<QuestionsList> FizikaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Inson tanasi necha voltdan boshlan tok kuchini xis qiladi", "36v", "50v", "43v", "56v", "36v", "");
        questionsLists.add(question1);
        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Matematika":
                return MatematikaQuestions();
            case "Informatika":
                return InformatikaQuestions();
            case "Fizika":
                return FizikaQuestions();
            default:
                return InglizTiliQuestions();
        }
    }
}
