package com.alden.myworkmanagertry.workers

import android.content.Context
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

private const val TAG = "newsWorker"
class newsWorker(ctx : Context, param : WorkerParameters):Worker(ctx, param) {
    override fun doWork(): Result {
        if (syncNews())
            return ListenableWorker.Result.success()
        else
            return ListenableWorker.Result.failure()
    }
    fun syncNews():Boolean{
        Log.d(TAG, "syncNews: Worker newsWorker running")
        return true
    }
}