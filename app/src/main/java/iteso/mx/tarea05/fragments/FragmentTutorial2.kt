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

class FragmentTutorial2 : Fragment() {

    companion object {
        fun newInstance() = FragmentTutorial2()
    }

    private lateinit var viewModel: FragmentTutorial2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tutorial2_fragment, container, false)
        val buttonPrevious = view.findViewById<Button>(R.id.fragment2_previous)
        buttonPrevious.setOnClickListener {
            (activity as ActivityTutorial).changeFragment(2)
        }
        val buttonNext = view.findViewById<Button>(R.id.fragment2_next)
        buttonNext.setOnClickListener {
            (activity as ActivityTutorial).changeFragment(3)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentTutorial2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
