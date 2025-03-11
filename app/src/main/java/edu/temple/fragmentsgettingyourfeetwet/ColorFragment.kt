package edu.temple.fragmentsgettingyourfeetwet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment

class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout and store the view in a variable
        val view = inflater.inflate(R.layout.fragment_color, container, false)

        // Initialize Spinner with colors
        view.findViewById<Spinner>(R.id.spinner).apply {
            adapter = ArrayAdapter(
                requireContext(), // Use requireContext() to avoid null pointer issues
                android.R.layout.simple_spinner_item,
                arrayOf("Blue", "Red", "White", "Black", "Magenta")
            ).also {
                it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            }
        }

        return view
    }
}
