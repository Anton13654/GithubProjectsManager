package com.aeinc.githubprojectsmanager.ui.infoScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun InfoScreen(){
    val viewModel: InfoViewModel = viewModel()
    val repoInfo = viewModel.status.collectAsState().value
    if (repoInfo!= null){
        Column(){
            Text(text = "id проекта : ${repoInfo.id}.")
            Text(text = "Имя проекта : ${repoInfo.name}.")
            Text(text = "Полное имя : ${repoInfo.fullName}.")
            Text(text = "Владелец : ${repoInfo.owner}.")
            Text(text = "Приватность : ${repoInfo.private}.")
            Text(text = "Ссылка : ${repoInfo.url}.")
        }
    }else{
        Text(text = "Данные загружаются")
    }

}