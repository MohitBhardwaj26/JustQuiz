package com.mohit.justquiz.data;

import com.mohit.justquiz.model.Question;

import java.util.ArrayList;


public interface AnswerListAsyncResponse {
     void processFinished(ArrayList<Question> questionArrayList);
}

