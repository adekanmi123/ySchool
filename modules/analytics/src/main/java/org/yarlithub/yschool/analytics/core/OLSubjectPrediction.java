package org.yarlithub.yschool.analytics.core;

import org.primefaces.model.chart.CartesianChartModel;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kana
 * Date: 11/30/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class OLSubjectPrediction {
    private ClassroomSubject olSubject;
    private List<String> predictedGrade = new ArrayList<String>();
    private List<Double> termMarks = new ArrayList<Double>();
    private List<Integer> termMarksLower = new ArrayList<Integer>();
    private List<Integer> termMarksUpper = new ArrayList<Integer>();
    private CartesianChartModel linearModelTermMarks;
    private List<String> msgs = new ArrayList<String>();
    private String msg = "No Significant Change Detected";
    private String msgWarning = "No Significant Change Detected";
    private String msgValidation = "No Significant Change Detected";
    private boolean msg_available=false;
    private boolean msgWarning_available=false;
    private boolean msgValidation_available=false;


    public boolean isMsgValidation_available() {
        return msgValidation_available;
    }

    public void setMsgValidation_available(boolean msgValidation_available) {
        this.msgValidation_available = msgValidation_available;
    }

    public boolean isMsg_available() {
        return msg_available;
    }

    public void setMsg_available(boolean msg_available) {
        this.msg_available = msg_available;
    }

    public boolean isMsgWarning_available() {
        return msgWarning_available;
    }

    public void setMsgWarning_available(boolean msgWarning_available) {
        this.msgWarning_available = msgWarning_available;
    }

    public String getMsgWarning() {
        return msgWarning;
    }

    public void setMsgWarning(String msgWarning) {

        this.msgWarning = msgWarning;
    }

    public String getMsgValidation() {
        return msgValidation;
    }

    public void setMsgValidation(String msgValidation) {
        this.msgValidation = msgValidation;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CartesianChartModel getLinearModelTermMarks() {
        return linearModelTermMarks;
    }

    public void setLinearModelTermMarks(CartesianChartModel linearModelTermMarks) {
        this.linearModelTermMarks = linearModelTermMarks;
    }

    public List<String> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<String> msgs) {
        this.msgs = msgs;
    }

    public List<Integer> getTermMarksLower() {
        return termMarksLower;
    }

    public void setTermMarksLower(List<Integer> termMarksLower) {
        this.termMarksLower = termMarksLower;
    }

    public List<Integer> getTermMarksUpper() {
        return termMarksUpper;
    }

    public void setTermMarksUpper(List<Integer> termMarksUpper) {
        this.termMarksUpper = termMarksUpper;
    }

    public ClassroomSubject getOlSubject() {
        return olSubject;
    }

    public void setOlSubject(ClassroomSubject olSubject) {
        this.olSubject = olSubject;
    }

    public List<String> getPredictedGrade() {
        return predictedGrade;
    }

    public void setPredictedGrade(List<String> predictedGrade) {
        this.predictedGrade = predictedGrade;
    }

    public List<Double> getTermMarks() {
        return termMarks;
    }

    public void setTermMarks(List<Double> termMarks) {
        this.termMarks = termMarks;
    }


}
