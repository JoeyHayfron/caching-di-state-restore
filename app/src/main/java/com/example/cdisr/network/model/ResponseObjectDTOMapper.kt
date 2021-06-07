package com.example.cdisr.network.model

import com.example.cdisr.domain.model.ResponseObject
import com.example.cdisr.domain.util.DomainMapper

class ResponseObjectDTOMapper : DomainMapper<ResponseObjectDTO, ResponseObject> {
    override fun mapToDomain(
        responseObject: ResponseObjectDTO
    ): ResponseObject {
        return ResponseObject(
            id = responseObject.id,
            url = UrlsDTOMapper().mapToDomain(responseObject.urlsDTO!!)
        )
    }

    override fun mapFromDomain(
        domainModel: ResponseObject
    ): ResponseObjectDTO {
        return ResponseObjectDTO(
            id = domainModel.id,
            urlsDTO = UrlsDTOMapper().mapFromDomain(domainModel.url!!),
        )
    }

    fun mapToDomainList(responseList: List<ResponseObjectDTO>): List<ResponseObject> {
        return responseList.map {
            mapToDomain(it)
        }
    }
}