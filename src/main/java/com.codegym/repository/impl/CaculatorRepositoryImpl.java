package com.codegym.repository.impl;

import com.codegym.repository.CaculatorRepository;

public class CaculatorRepositoryImpl implements CaculatorRepository {
    @Override
    public float converter(float usd){
        return usd*23000;
    }
}
