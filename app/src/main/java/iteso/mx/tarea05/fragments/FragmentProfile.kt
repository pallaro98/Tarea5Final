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
import iteso.mx.tarea05.activities.ActivityMain
import iteso.mx.tarea05.activities.ActivityStart
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.startActivity

class FragmentProfile : Fragment() {

    companion object {
        fun newInstance() = FragmentProfile()
    }

    private lateinit var viewModel: FragmentProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile_fragment, container, false)
        val cerrarSesion = view.findViewById<Button>(R.id.boton_cerrar_sesion)
        cerrarSesion.setOnClickListener {
            startActivity<ActivityStart>()
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
