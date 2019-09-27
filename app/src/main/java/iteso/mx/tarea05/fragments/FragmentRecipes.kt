package iteso.mx.tarea05.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import iteso.mx.tarea05.R
import iteso.mx.tarea05.adapters.AdapterRecipe
import org.jetbrains.anko.find

class FragmentRecipes : Fragment() {
    private lateinit var mAdapter: AdapterRecipe
    private lateinit var mRecycler: FrameLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)
        /* TODO fetch data from parse and replace it inside AdapterRecipe*/
        mAdapter = AdapterRecipe(arrayListOf())
        mRecycler = view.find(R.id.fragment_recipes_rv_recipes)

        return view
    }
}
