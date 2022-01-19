package com.example.navigation_practice_jan19_trint01

//new imports copied from gerson's file
//stil having problems even with these imports copied
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


//old imports
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.navigation.fragment.findNavController
import com.example.navigation_practice_jan19_trint01.databinding.FragmentFirstNameBinding

class FirstNameFragment : Fragment() {

    private var _binding : FragmentFirstNameBinding? = null
    private val binding : FragmentFirstNameBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstNameBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            nextBtn.setOnClickListener{
                val firstName = nameEt.editText?.text?.toString()
                val lastName = lastNameEt.editText?.text?.toString()

                val direction = FirstNameFragmentDirections.actionFirstNameFragmentToPasswordFragment(
                //ActionFirstNameFragmentToPasswordFragment(
                    firstName!!,
                    lastName!!
                )
                findNavController().navigate(direction)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}