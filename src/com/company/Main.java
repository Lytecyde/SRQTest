package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;
import java.util.LinkedList;


public class Main {
    //selection of test buttons
    ///////////////////////////
    private static JButton selectASRIButton = new JButton("ASRI (36)");
    private static JButton selectSRQButton = new JButton("SRQ (63)");
    //test Frame
    private static JFrame testScreen;
    private static JLabel questionText;
    private static JPanel questionPanel;
    private static JPanel selectionPanel;
    private static JRadioButton[] answers;

    private static ButtonGroup likertScale;
    private static Question[] questions;

    public static int currentAnswer = 0;
    private static JButton okbutton;
    private static JPanel answerPanel;
    //constants
    private final static int asritTestLength = 36;
    private final static int srqTestLength = 63;
    private static int questionIndex = 0;

    private static int testLength;
    private static LinkedList<Question> questionLinkedList = new LinkedList<Question>();

    public static void main(String[] args) {
        // write your code here
        selectionPanel = new JPanel();
        testScreen = new JFrame();
        testScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        testScreen.setLayout(new BorderLayout());
        testScreen.setPreferredSize(new Dimension(800, 120));
        TestListener selectTestListener = new TestListener();
        selectASRIButton.addActionListener(selectTestListener);
        selectionPanel.add(selectASRIButton);
        selectSRQButton.addActionListener(selectTestListener);
        selectionPanel.add(selectSRQButton);

        testScreen.add(selectionPanel, BorderLayout.EAST);
        testScreen.setVisible(true);
        testScreen.pack();


    }

    public static void createContent() {
        questionPanel = new JPanel();
        answerPanel = new JPanel();
        answerPanel.setLayout(new GridLayout(1, 5));
        questionText = new JLabel();

        questionText.setText(questionLinkedList.get(questionIndex).itemText);
        questionPanel.add(questionText);
        testScreen.add(questionPanel, BorderLayout.NORTH);

        answers = new JRadioButton[5];
        likertScale = new ButtonGroup();

        answers[0] = new JRadioButton("Pole tõene");
        answers[1] = new JRadioButton("Pole eriti tõene");
        answers[2] = new JRadioButton("Ebakindel");
        answers[3] = new JRadioButton("On pisut tõene ");
        answers[4] = new JRadioButton("On väga tõene");

        likertScale.add(answers[0]);
        likertScale.add(answers[1]);
        likertScale.add(answers[2]);
        likertScale.add(answers[3]);
        likertScale.add(answers[4]);

        clearRadioButtons();
        answers[0].setVisible(true);
        answers[1].setVisible(true);
        answers[2].setVisible(true);
        answers[3].setVisible(true);
        answers[4].setVisible(true);
        answerPanel.add(answers[0]);
        answerPanel.add(answers[1]);
        answerPanel.add(answers[2]);
        answerPanel.add(answers[3]);
        answerPanel.add(answers[4]);
        testScreen.add(answerPanel, BorderLayout.CENTER);

        RBListener rbl = new RBListener();
        answers[0].addMouseListener(rbl);
        answers[1].addMouseListener(rbl);
        answers[2].addMouseListener(rbl);
        answers[3].addMouseListener(rbl);
        answers[4].addMouseListener(rbl);

        OkListener okl = new OkListener();
        okbutton = new JButton("OK");
        okbutton.addActionListener(okl);
        testScreen.add(okbutton, BorderLayout.SOUTH);
        testScreen.setVisible(true);
        testScreen.pack();
    }

    public static void clearRadioButtons() {

        likertScale.clearSelection();

    }

    public static LinkedList shuffleQuestions(Question[] qs) {
        LinkedList<Question> qll = new LinkedList();
        for (Question q : qs) {
            qll.add(q);
        }
        Collections.shuffle(qll);
        return qll;
    }


    public static class RBListener implements MouseListener {


        //could be made simpler with something like likertScale.getSelected();

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == answers[0]) {
                currentAnswer = 1;
            }
            if (e.getSource() == answers[1]) {
                currentAnswer = 2;
            }
            if (e.getSource() == answers[2]) {
                currentAnswer = 3;
            }
            if (e.getSource() == answers[3]) {
                currentAnswer = 4;
            }
            if (e.getSource() == answers[4]) {
                currentAnswer = 5;
            }
        }


        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static class TestListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == selectASRIButton) {
                testLength = asritTestLength;
                questions = new Question[testLength];
                for (int i = 0; i < testLength; i++) {
                    questions[i] = new Question(QuestionData.ASRIitem[i], i, QuestionData.ASRIreversibles[i]);
                }
                selectionPanel.removeAll();
                selectionPanel.repaint();
                questionLinkedList = shuffleQuestions(questions);
                createContent();
            }
            if (e.getSource() == selectSRQButton) {
                testLength = srqTestLength;
                questions = new Question[testLength];
                for (int i = 0; i < testLength; i++) {
                    questions[i] = new Question(QuestionData.SRQitem[i], i, QuestionData.SRQreversibles[i]);
                }
                selectionPanel.removeAll();
                selectionPanel.repaint();
                questionLinkedList = shuffleQuestions(questions);
                createContent();
                //displayHint();
            }

        }
    }

    public static class OkListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == okbutton && currentAnswer > 0) {




                if (questionIndex == testLength - 1) {//checks which test in use

                    testScreen.dispose();
                } else {


                    System.out.println(questionIndex + " : " + (questionLinkedList.get(questionIndex).id + 1)
                            + " : " + currentAnswer +" : " + (questionLinkedList.get(questionIndex).reverse?"R":""));
                    scoring(questionIndex, currentAnswer);
                    questionIndex++;
                    String q = ""+questionLinkedList.get(questionIndex).itemText;
                    questionText.setText(q);
                    //displayHint();

                    //clear stuff for the next questionPanel
                    clearRadioButtons();
                    currentAnswer = 0;
                }
            }
        }
    }

    private static void displayHint(){
        if (questionIndex < testLength) {
            String r = questionLinkedList.get(questionIndex).reverse?"R":"";//CHECK
            String q = ""+questionLinkedList.get(questionIndex).itemText+r;
            questionText.setText(q);
        }
    }

    private static void scoring(int i, int currentAnswer) {
        int pointScore = 0;
        System.out.println("currentanswer:" +currentAnswer);
        if (questionLinkedList.get(i).reverse) {
            pointScore = 6 - currentAnswer;
        } else {
            pointScore = currentAnswer;
        }
        System.out.println("current pointscore:"+pointScore);
        questions[i].answer = pointScore;
        if (testLength == 63) {//checks which test is running
            //RETSPIA
            String[] subscales = {"receiving", "evaluating", "triggering", "searching", "planning", "implementing", "assessing"};
            int[] scores = new int[7];
            for (int j = 0; j < 63; j++) {
                //System.out.println("klass " +(j%7) +"on" + subscales[j%7] );
                scores[j % 7] += questions[j].answer;
            }
            int total = 0;
            for (int k = 0; k < 7; k++) {
                System.out.println(scores[k]);
                total += scores[k];
            }

            //print results
            for (int k = 0; k < 7; k++) {
                System.out.println(subscales[k] + ": " + scores[k]);
            }
            String rec = "";
            String eva = "";
            String tri = "";
            String sea = "";
            String frm = "";
            String imp = "";
            String ass = "";
            for (int m = 7; m < scores[0]; m++) {
                rec += "-";
            }
            for (int m = 7; m < scores[1]; m++) {
                eva += "-";
            }
            for (int m = 7; m < scores[2]; m++) {
                tri += "-";
            }
            for (int m = 7; m < scores[3]; m++) {
                sea += "-";
            }
            for (int m = 7; m < scores[4]; m++) {
                frm += "-";
            }
            for (int m = 7; m < scores[5]; m++) {
                imp += "-";
            }
            for (int m = 7; m < scores[6]; m++) {
                ass += "-";
            }

            System.out.println("RECEIVING   :" + rec);
            System.out.println("EVALUATING  :" + eva);
            System.out.println("TRIGGERING  :" + tri);
            System.out.println("SEARCHING   :" + sea);
            System.out.println("FORMULATING :" + frm);
            System.out.println("IMPLEMENTING:" + imp);
            System.out.println("ASSESSING   :" + ass);
            System.out.println("Total srq score: " + total);
        } else {
        }
    }
}
