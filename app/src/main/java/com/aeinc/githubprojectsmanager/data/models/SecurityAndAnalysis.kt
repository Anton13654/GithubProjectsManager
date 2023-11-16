package com.aeinc.githubprojectsmanager.data.models

import kotlinx.serialization.SerialName


data class SecurityAndAnalysis (

  @SerialName("advanced_security"               ) var advancedSecurity             : AdvancedSecurity?             = AdvancedSecurity(),
  @SerialName("secret_scanning"                 ) var secretScanning               : SecretScanning?               = SecretScanning(),
  @SerialName("secret_scanning_push_protection" ) var secretScanningPushProtection : SecretScanningPushProtection? = SecretScanningPushProtection()

)