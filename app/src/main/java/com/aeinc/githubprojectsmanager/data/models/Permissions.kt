package com.aeinc.githubprojectsmanager.data.models

import kotlinx.serialization.SerialName


data class Permissions (

  @SerialName("admin" ) var admin : Boolean? = null,
  @SerialName("push"  ) var push  : Boolean? = null,
  @SerialName("pull"  ) var pull  : Boolean? = null

)