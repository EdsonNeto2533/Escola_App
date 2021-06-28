package com.example.drawerlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import androidx.fragment.app.Fragment

class InformacoesAcaFragment: Fragment() {
    private var grupos = mutableListOf<String>()
    private var filhos = mutableListOf<String>()
    private var colecao = hashMapOf<String , String>(Pair("key" , "value"))
    private lateinit var  mExpandableListView: ExpandableListView
    private lateinit var mExpandableListAdapter: ExpandableListAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.informacoes_aca_fragment,container,false)

        criarListaGrupos()




        return view
    }


    fun criarListaGrupos(){

    }

}