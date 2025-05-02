package com.example.legalrisk.pipelines;

public interface AnalysisPipeline {

    void getAllDocuments();

    void checkAllDocuments();

    void conductAllAnalysis();

    void checkAllAnalysis();

    void makingRecommendations();
}
