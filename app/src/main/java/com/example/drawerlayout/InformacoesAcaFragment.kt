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
    private var colecao = hashMapOf<String , List<String>>()
    private lateinit var  mExpandableListView: ExpandableListView
    //private lateinit var mExpandableListAdapter: ExpandableListAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.informacoes_aca_fragment,container,false)

        criarGrupos()
        criarColecoes()
        mExpandableListView = view.findViewById(R.id.elvInfoAcade)
        //mExpandableListAdapter = ExpandableListAdapter(this, grupos,filhos)




        return view
    }

    //cria as colecoes e adiciona os filhos no metodo carregarfilhos
    fun criarColecoes(){
        val informacoesPessoaisModelo = arrayOf("nome: exemplo" , "cpf: exemplo")
        val informacoesAcademicasModelo = arrayOf("matricula: exemplo" , "unidade: Paulo Picanço")
        val historicoAcademicoModelo = arrayOf("Disciplina: exemplo" , "nota: exemplo")

        for (i in grupos.withIndex()){
            if (i.value.equals("Informações Pessoais")){
                carregaFilhos(informacoesPessoaisModelo)
            } else if (i.value.equals("Informações Acadêmicas")){
                carregaFilhos(informacoesAcademicasModelo)
            } else if (i.value.equals("Historico Acadêmico")){
                carregaFilhos(historicoAcademicoModelo)
            }
        }

    }

    //carrega os modelos de filhos dentro da lista de filhos
    private fun carregaFilhos(filhomodelo: Array<String>) {
            for (i in filhomodelo)
            filhos.add(i)
    }


    fun criarGrupos(){
        grupos.add("Informações Pessoais")
        grupos.add("Informações Acadêmicas")
        grupos.add("Historico Acadêmico")

    }

}