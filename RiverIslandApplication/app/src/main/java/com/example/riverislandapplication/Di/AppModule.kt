package com.example.riverislandapplication.Di

import com.example.riverislandapplication.Common.Constants.BASE_URL
import com.example.riverislandapplication.Data.Repository.ItemRepositoryImpl
import com.example.riverislandapplication.Data.remote.ItemAPIinterface
import com.example.riverislandapplication.Domain.Repository.ItemRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideApiService(): ItemAPIinterface {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ItemAPIinterface::class.java)
    }


    @Provides
    @Singleton
    fun providesItemRepository(api:ItemAPIinterface):ItemRepository{
        return ItemRepositoryImpl(api)
    }


}