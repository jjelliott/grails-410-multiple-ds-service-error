package com.example

import grails.gorm.services.Service
import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

@Service(OtherDomain)
abstract class OtherDataService{

    abstract OtherDomain find (Long id)

    abstract OtherDomain delete(Long id)

//    @Transactional
    void deleteIf(Long id){
        if (find(id).name == 'blah'){
            delete(id)
        }
    }
}
