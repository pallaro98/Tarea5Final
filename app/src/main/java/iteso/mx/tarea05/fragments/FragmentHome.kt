package iteso.mx.tarea05.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.ViewAnimator

import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.HomeContract
import iteso.mx.tarea05.activities.HomePresenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import kotlin.concurrent.thread

class FragmentHome : Fragment(), HomeContract.View {
    companion object {
        fun newInstance() = FragmentHome()
        const val SHOW_REFRESH = 0
        const val SHOW_PROGRESSBAR = 1
        const val SHOW_RECIPE = 2
        const val SHOW_NORECIPE = 3
    }

    private lateinit var VF : ViewAnimator
    private lateinit var mPresenter: HomeContract.Presenter
    private lateinit var viewModel: FragmentHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_fragment, container, false)
        VF = view.findViewById<ViewAnimator>(R.id.VA)
        val refresh = view.findViewById<Button>(R.id.fragment_refresh)
        refresh.setOnClickListener {
            mPresenter = HomePresenter(this)
            mPresenter.fetchData()

        }

        return view
    }

    override fun showProgress() {
        VF.displayedChild = SHOW_PROGRESSBAR
    }

    override fun showInfo() {
        VF.displayedChild = SHOW_RECIPE
    }

    override fun showNoInfo() {
        VF.displayedChild = SHOW_NORECIPE

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
