package redice.co.nz.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import redice.co.nz.Main

/** Launches the desktop (LWJGL3) application.  */

    fun main() {
        Lwjgl3Application(Main(), Lwjgl3ApplicationConfiguration().apply {
            setTitle("GdxDemo")
            setWindowedMode(640, 480)
            setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png", "libgdx16.png")
        })
    }


