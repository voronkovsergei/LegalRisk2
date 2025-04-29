package com.example.legalrisk.pipelines;



import com.example.legalrisk.analyzes.Analyze;
import com.example.legalrisk.documents.Document;

import java.util.List;

public class ResidentialApartmentAnalysisPipeline implements AnalysisPipeline{

    List<Document> documents;

    List<Analyze> tasks;

    ResidentialApartmentAnalysisPipeline(){
        System.out.println("initialize");
    }

}
