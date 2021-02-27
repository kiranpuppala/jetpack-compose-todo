package com.kiranpuppala.jetpacktodo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
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
