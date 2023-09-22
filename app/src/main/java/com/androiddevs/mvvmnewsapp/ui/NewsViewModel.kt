package com.androiddevs.mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

/**
 * Created by Abhinay on 22/09/23.
 */
class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}