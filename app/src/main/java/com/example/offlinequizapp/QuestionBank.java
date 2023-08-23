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
        final QuestionsList question6 = new QuestionsList("34-12+5-11", "NAN", "16", "34", "45", "9", "");
        final QuestionsList question7 = new QuestionsList("How many math operations are there?", "2", "3", "4", "5", "4", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        return questionsLists;
    }

    private static List<QuestionsList> InformatikaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question2 = new QuestionsList("What does the CTRL + A command do?", "Delete", "Select All", "ON-OFF", "Screenshot", "Select All", "");
        final QuestionsList question3 = new QuestionsList("What does the CTRL + C command do?", "Delete", "Screenshot", "None", "Copy", "Copy", "");
        final QuestionsList question4 = new QuestionsList("What does the enter key do?", "Back", "Next", "To the top", "To the bottom", "Next", "");
        final QuestionsList question5 = new QuestionsList("Why do you need WIN + R", "To open run window", "Screenshot", "Applications", "Word", "To open run window", "");
        final QuestionsList question6 = new QuestionsList("In which line is the button to turn off the computer?", "Alt + F5", "Alt + F6", "Alt + F4", "Alt + F1", "Alt + F4", "");
        final QuestionsList question7 = new QuestionsList("What does the Caps Lock key do?", "Write in lower case", "Exit the program", "Turn off computer", "Screenshot", "Write in lower case", "");

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

        final QuestionsList question1 = new QuestionsList("I ______ bus on Mondays.", "m going to work with", "m going to work by", "go to work with", "go to work by", "go to work by", "");
        final QuestionsList question2 = new QuestionsList("Sorry, but this chair is ______.", "me", "mine", "my", "our", "mine", "");
        final QuestionsList question3 = new QuestionsList("How old ______?", "are you / am 20 years old.", "have you / have 20 years old", "are you / am 20 years.", "are you / am 20 years.", "are you / am 20 years old.", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        return questionsLists;

    }

    private static List<QuestionsList> FizikaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Which law states that the magnetic fields are related to the electric current produced in them?", "Avogadro’s law", "Ampere''s law", "Boyle''s law", "Ohm''s law", "Ampere''s law", "");
        final QuestionsList question2 = new QuestionsList("What is the unit of measure for cycles per second?", "hertz", "ampere", "ohm", "decibel", "hertz", "");
        final QuestionsList question3 = new QuestionsList("Who discovered the rotating magnetic field?", "Nikola Tesla", "Paul Langevin", "Georgy Flerov", "Pierre Curie", "Nikola Tesla", "");
        final QuestionsList question4 = new QuestionsList("Which is the weakest force in nature?", "gravity", "weak force", "electromagnetic force", "strong force", "gravity", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Math":
                return MatematikaQuestions();
            case "Information":
                return InformatikaQuestions();
            case "Physics":
                return FizikaQuestions();
            default:
                return InglizTiliQuestions();
        }
    }
}