package com.bnp.service;

import com.bnp.dto.account_dto;
import com.bnp.dto.updateaccountDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class implementation implements account_service{
    private final List<account_dto> accounts = new ArrayList();
    @Override
    public account_dto createaccount(account_dto account_service) {

        return null;
    }

    @Override
    public account_dto updateaccount(updateaccountDTO account_dto, UUID id) {
        return null;
    }

    @Override
    public account_dto deletaccount(UUID id) {
        return null;
    }

    @Override
    public account_dto accountbyid(UUID id) {
        return null;
    }

    @Override
    public List<account_dto> listofaccounts() {
        return List.of();
    }
}
