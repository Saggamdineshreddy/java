package com.bnp.service;

import com.bnp.dto.account_dto;
import com.bnp.dto.updateaccountDTO;

import java.util.List;
import java.util.UUID;

public interface account_service {
    public account_dto createaccount (account_dto account_service );
    public account_dto updateaccount(updateaccountDTO account_dto, UUID id);
    public account_dto deletaccount(UUID id);
    public account_dto accountbyid(UUID id );
    public List<account_dto> listofaccounts();
}
