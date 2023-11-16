package com.aeinc.githubprojectsmanager.data

import android.util.Log
import com.aeinc.githubprojectsmanager.data.models.TemplateRepository
import com.aeinc.githubprojectsmanager.domain.ApiRepository
import com.aeinc.githubprojectsmanager.domain.models.SmartModelRepository
import com.google.gson.Gson
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class RepositoryImpl: ApiRepository {
    override suspend fun takeResponse(): SmartModelRepository {
        var serwerAnswer = TemplateRepository()
        val client = HttpClient(CIO)
        val response: HttpResponse = client.get("https://api.github.com/repos/Anton13654/GithubProjectsManager")
        val responseBody = response.readText()
        val gson = Gson()
        serwerAnswer = gson.fromJson(responseBody, TemplateRepository::class.java)
        client.close()
        return serwerAnswer.toSmartModel()
    }


}