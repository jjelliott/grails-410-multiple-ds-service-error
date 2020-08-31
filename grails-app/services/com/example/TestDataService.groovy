package com.example

import grails.gorm.services.Service
import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

@Service(TestDomain)
abstract class TestDataService{
    @ReadOnly("secondary")
    abstract TestDomain find (Long id)

    @Transactional("secondary")
    void delete(Long id){
        TestDomain.executeUpdate("delete from TestDomain where id = :id", [id: id])
    }

    @ReadOnly("secondary")
    TestDomain findMaybe(Long id){
        [find(id)].find{it.name != 'blah'}
    }
}
