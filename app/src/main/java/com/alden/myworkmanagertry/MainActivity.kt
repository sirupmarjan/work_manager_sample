package com.alden.myworkmanagertry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.alden.myworkmanagertry.databinding.ActivityMainBinding
import com.alden.myworkmanagertry.workers.newsWorker

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            startWorker()
        }

    }

    fun startWorker(){
        /**
         * single work
         * */
        /*var mWorkManager = WorkManager.getInstance()
        mWorkManager.beginUniqueWork(
            "uniqueWork",
            ExistingWorkPolicy.REPLACE,
            OneTimeWorkRequest.from(newsWorker::class.java)
        ).enqueue()*/
    }
}