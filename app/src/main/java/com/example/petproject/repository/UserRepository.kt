package com.example.petproject.repository

import com.example.petproject.datasource.LocalDataSource
import com.example.petproject.datasource.RemoteDataSource
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) {
}