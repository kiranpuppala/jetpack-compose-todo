package com.kiranpuppala.jetpacktodo.di

import android.app.Application
import com.kiranpuppala.jetpacktodo.data.TaskDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import androidx.room.*

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesTaskDatabase(application: Application) = Room.databaseBuilder(application,TaskDatabase:: class.java,"task_database")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    fun providesTaskDao(db: TaskDatabase) = db.taskDao()

}