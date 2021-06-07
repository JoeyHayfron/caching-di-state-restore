package com.example.cdisr.domain.util

interface DomainMapper<T, DomainModel> {
    fun mapToDomain(responseObject: T): DomainModel

    fun mapFromDomain(domainModel: DomainModel): T
}