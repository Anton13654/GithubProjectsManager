package com.aeinc.githubprojectsmanager.domain

import com.aeinc.githubprojectsmanager.data.models.TemplateRepository
import com.aeinc.githubprojectsmanager.domain.models.SmartModelRepository

interface ApiRepository {

    suspend fun takeResponse(): SmartModelRepository
}