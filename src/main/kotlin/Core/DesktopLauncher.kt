package org.anomalydevv.core

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import org.anomalydevv.Core.game
import org.anomalydevv.core.config

object DesktopLauncher {
    fun launc(){
        println("Launching Starting...")
        Lwjgl3Application(game(), Lwjgl3ApplicationConfiguration().apply {

            setTitle("DestroyTheVerse")
            setWindowedMode(config.WindowX,config.WindowY)
            useVsync(true)
            setForegroundFPS(60)

        })
        println("Launching Succes!")
    }
}