package com.aeinc.githubprojectsmanager.data

import com.aeinc.githubprojectsmanager.domain.ApiRepository
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.statement.*

class RepositoryImpl: ApiRepository {

    val client = HttpClient(CIO)
    val response: HttpResponse = client.get()

    override fun takeResponse() {
        TODO("Not yet implemented")
    }


}