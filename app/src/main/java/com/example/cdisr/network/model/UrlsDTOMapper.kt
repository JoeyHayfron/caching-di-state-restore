package com.example.cdisr.network.model

import com.example.cdisr.domain.model.Urls
import com.example.cdisr.domain.util.DomainMapper

class UrlsDTOMapper : DomainMapper<UrlsDTO, Urls> {
    override fun mapToDomain(responseObject: UrlsDTO): Urls {
        return Urls(
            raw = responseObject.raw,
            full = responseObject.full,
            regular = responseObject.regular,
            small = responseObject.small,
            thumb = responseObject.thumb
        )
    }

    override fun mapFromDomain(domainModel: Urls): UrlsDTO {
        return UrlsDTO(
            raw = domainModel.raw,
            full = domainModel.full,
            regular = domainModel.regular,
            small = domainModel.small,
            thumb = domainModel.thumb
        )
    }
}