package com.nayeem2021.liilab_app_dev_assesment_project.presentation.model

data class SingleRecentEventModel(val name: String, val content: String, val viewCount: Int)
data class HomePageRecentEventModel(val events: List<SingleRecentEventModel>)
