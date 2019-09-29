package iteso.mx.tarea05.activities

import iteso.mx.tarea05.fragments.FragmentHome
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.util.*

class HomePresenter (private val view: FragmentHome): HomeContract.Presenter {
    override fun fetchData() {
        view.showProgress()
        doAsync {
            Thread.sleep(5000)
            val random = Random()
            val randomInt = random.nextInt(20)
            if (randomInt < 11) {
                uiThread {
                    view.showInfo()
                }
            } else {
                uiThread {
                    view.showNoInfo()
                }
            }
        }
    }

}