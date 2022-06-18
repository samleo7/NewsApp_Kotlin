package com.example.newsappmvvm.db

import com.example.newsappmvvm.models.Article

data class NewsResponse(
        val articles: MutableList<Article>,
        val status: String,
        val totalResults: Int
)