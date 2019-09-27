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
import org.jetbrains.anko.doAsync
import kotlin.concurrent.thread

class FragmentHome : Fragment() {
    companion object {
        fun newInstance() = FragmentHome()
    }
    private lateinit var VF : ViewAnimator

    private lateinit var viewModel: FragmentHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_fragment, container, false)
        VF = view.findViewById<ViewAnimator>(R.id.VA)
        val refresh = view.findViewById<Button>(R.id.fragment_refresh)
        refresh.setOnClickListener {
            VF.showNext()
            doAsync {
                Thread.sleep(5000)
                VF.showNext()
            }
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
