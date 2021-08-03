package com.rza.HomeLibrary.api.controllers.abstracts;

import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;

import java.util.List;

public interface ControllerInterface<T> {
    Result add(T entity);
    DataResult<List<T>> getAll();
}
