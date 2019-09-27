package iteso.mx.tarea05.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.ActivityTutorial

class FragmentTutorial3 : Fragment() {

    companion object {
        fun newInstance() = FragmentTutorial3()
    }

    private lateinit var viewModel: FragmentTutorial3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tutorial3_fragment, container, false)
        val buttonPrevious = view.findViewById<Button>(R.id.fragment3_previous)
        buttonPrevious.setOnClickListener {
            (activity as ActivityTutorial).changeFragment(4)
        }
        val buttonNext = view.findViewById<Button>(R.id.fragment3_next)
        buttonNext.setOnClickListener {
            (activity as ActivityTutorial).changeFragment(5)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentTutorial3ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
