/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.baitaplon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Buu
 */
public class Conversation extends Question{
    private List<MultipleChoice> questions;
    
    public Conversation(String c, Level lv, Category ca){
        super(c, lv, ca);
        questions = new ArrayList<>();
    }
    
    public void addQuestion(Question q){
        MultipleChoice c = (MultipleChoice) q;
        this.questions.add(c);
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        
        return s;
    }
    
    

    /**
     * @return the questions
     */
    public List<MultipleChoice> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<MultipleChoice> questions) {
        this.questions = questions;
    }
    
    
}
