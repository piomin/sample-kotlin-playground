package pl.piomin.services.test

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.junit.Test

class CoroutinesTest {

    @Test
    fun testSimpleCoroutineThreadMain() {
        var i: Int = 0
        repeat(10) {
            GlobalScope.launch(Dispatchers.Unconfined) {
                i++
                println("$i: ${Thread.currentThread().name}")
            }
        }
        Thread.sleep(100)
    }

    @Test
    fun testSimpleCoroutine() {
        var i: Int = 0
        repeat(10) {
            GlobalScope.launch {
                i++
                println("$i: ${Thread.currentThread().name}")
            }
        }
        Thread.sleep(100)
    }

    @Test
    fun testSimpleCoroutineWithDelay() {
        repeat(10) {
            GlobalScope.launch {
                println("Before delay $it: ${Thread.currentThread().name}")
                delay(10)
                println("After delay $it: ${Thread.currentThread().name}")
            }
        }
        Thread.sleep(200)
    }

    @Test
    fun testSimpleThread() {
        var j: Int = 0
        repeat(10) {
            Thread(Runnable {
                j++
                println("$j: ${Thread.currentThread().name}")
            }).start()
        }
        Thread.sleep(100)
    }
}