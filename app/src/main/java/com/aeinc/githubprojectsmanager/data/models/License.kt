package com.aeinc.githubprojectsmanager.data.models

import kotlinx.serialization.SerialName


data class License (

  @SerialName("key"      ) var key     : String? = null,
  @SerialName("name"     ) var name    : String? = null,
  @SerialName("url"      ) var url     : String? = null,
  @SerialName("spdx_id"  ) var spdxId  : String? = null,
  @SerialName("node_id"  ) var nodeId  : String? = null,
  @SerialName("html_url" ) var htmlUrl : String? = null

)