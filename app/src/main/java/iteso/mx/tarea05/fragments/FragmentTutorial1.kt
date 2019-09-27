package iteso.mx.tarea05.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.ActivityTutorial

class FragmentTutorial1 : Fragment(){

    companion object {
        fun newInstance() = FragmentTutorial1()
    }

    private lateinit var viewModel: FragmentTutorial1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tutorial1_fragment, container, false)
        val buttonNext = view.findViewById<Button>(R.id.fragment1_next)
        buttonNext.setOnClickListener {
            (activity as ActivityTutorial).changeFragment(1)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentTutorial1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
