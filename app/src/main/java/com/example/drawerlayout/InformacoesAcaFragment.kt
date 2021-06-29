package com.example.drawerlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import androidx.fragment.app.Fragment

class InformacoesAcaFragment: Fragment() {
    private var grupos = mutableListOf<String>()
    private var filhos = hashMapOf<String , List<String>>()
    private lateinit var  mExpandableListView: ExpandableListView
    //private lateinit var mExpandableListAdapter: ExpandableListAdapter
    private lateinit var adapter: MainAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.informacoes_aca_fragment,container,false)

        alimentarListas()
        mExpandableListView = view.findViewById(R.id.elvInfoAcade)

        adapter = MainAdapter(grupos , filhos)




        return view
    }





    fun alimentarListas(){
        grupos.add("Informações Pessoais")
        grupos.add("Informações Acadêmicas")
        grupos.add("Historico Acadêmico")

        val listaPessoal = mutableListOf<String>()
        val listaAcademica = mutableListOf<String>()
        val listaHacademica = mutableListOf<String>()


        listaPessoal.add("Nome: teste")
        listaPessoal.add("CPF: teste")
        listaPessoal.add("RG: teste")
        listaPessoal.add("Reservista: teste")

        filhos.put(grupos.get(0) , listaPessoal)

        listaAcademica.add("Matricula: teste")
        listaAcademica.add("Curso: teste")
        listaAcademica.add("Unidade: teste")

        filhos.put(grupos.get(1) , listaAcademica)

        listaHacademica.add("1 Semestre")
        listaHacademica.add("anatomia buco , av1: 10 , av2:10 , Media:10")
        listaHacademica.add("teste")
        listaHacademica.add("teste")

        filhos.put(grupos.get(2) , listaHacademica)



    }

}