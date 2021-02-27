package com.kiranpuppala.jetpacktodo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import com.kiranpuppala.jetpacktodo.ui.theme.JetpackTodoTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTodoTheme {
                // Content
            }
        }
    }
}
