package com.alden.myworkmanagertry.workers

import android.content.Context
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

private const val TAG = "UpdateWorker"
class UpdateWorker(ctx : Context, params : WorkerParameters):Worker(ctx, params)
{
    override fun doWork(): Result {
        if (addDatabase())
            return ListenableWorker.Result.success()
        else
            return ListenableWorker.Result.failure()
    }
    fun addDatabase():Boolean{
        Log.d(TAG, "addDatabase: ")
        return true
    }
}