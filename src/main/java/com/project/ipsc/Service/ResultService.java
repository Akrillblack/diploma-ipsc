package com.project.ipsc.Service;

import com.project.ipsc.Model.Result;

import java.util.List;

public interface ResultService {
    List<Result> filterResult(String resultClass, String category);

    public List<Result> findAll();
}
