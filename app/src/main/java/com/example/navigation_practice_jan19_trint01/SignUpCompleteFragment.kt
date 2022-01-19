package com.example.navigation_practice_jan19_trint01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigation_practice_jan19_trint01.databinding.FragmentSignUpCompleteBinding

class SignUpCompleteFragment : Fragment() {

    //having problem using the args. maybe because of plugin that will not work
    //id 'androidx.navigation.safeargs'
    private val args: SignUpCompleteFragmentArgs by navArgs()

    private var _binding : FragmentSignUpCompleteBinding? = null
    private val binding : FragmentSignUpCompleteBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpCompleteBinding.inflate(inflater,container,false   )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            nameTv.text = args.firstName
            lastNameTv.text = args.lastName
            passwordTv.text = args.password
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}