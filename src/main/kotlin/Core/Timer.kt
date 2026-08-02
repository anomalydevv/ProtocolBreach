package org.anomalydevv.core

import com.badlogic.gdx.Gdx

object Timer {

    private class TimerTask(val target: Float, val action: () -> Unit) {
        var timer: Float = 0f
    }

    private val tasks = mutableListOf<TimerTask>()

    fun CreateTimer(s: Float, action: () -> Unit) {

        var task = tasks.find { it.action == action }
        if (task == null) {
            task = TimerTask(s, action)
            tasks.add(task)
        }

        task.timer += Gdx.graphics.deltaTime
        if (task.timer >= s) {
            task.timer = 0f
            task.action()
        }
    }
}