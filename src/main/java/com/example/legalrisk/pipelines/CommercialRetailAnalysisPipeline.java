package com.example.legalrisk.pipelines;

import com.example.legalrisk.analyzes.Analyze;
import com.example.legalrisk.documents.Document;

import java.util.List;

public class CommercialRetailAnalysisPipeline implements AnalysisPipeline{

    List<Document> documents;

    List<Analyze> tasks;

    public CommercialRetailAnalysisPipeline() {
        System.out.println("initialize");
    }
}
