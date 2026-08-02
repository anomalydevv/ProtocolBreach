package org.anomalydevv.core

import com.badlogic.gdx.Gdx

object InputManager {
    private var lastExecutionTime: Long = 0

    fun CheckKey(key: Int, cooldown: Float = 0f, action: () -> Unit) {
        if (Gdx.input.isKeyPressed(key)) {
            val currentTime = System.currentTimeMillis()
            val cooldownInMillis = (cooldown * 1000).toLong()

            if (currentTime - lastExecutionTime >= cooldownInMillis) {
                action()
                lastExecutionTime = currentTime
            }
        }
    }
}