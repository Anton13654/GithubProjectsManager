package com.aeinc.githubprojectsmanager.domain.models

import com.aeinc.githubprojectsmanager.data.models.Owner
import kotlinx.serialization.SerialName

data class SmartModelRepository(
    val id: Int? = 777,
    val name: String? = "ZZZ",
    val fullName: String? = "ZZZ",
    val owner: String? = "ZZZ",
    val private: Boolean? = false,
    val url: String? = "ZZZ"
)
