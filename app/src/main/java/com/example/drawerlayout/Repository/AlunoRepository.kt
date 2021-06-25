package com.example.drawerlayout.Repository

import com.example.drawerlayout.Entity.AlunoEntity

class AlunoRepository {
    companion object {
        private val alunoList = mutableListOf<AlunoEntity>()


        fun salvarAluno(aluno: AlunoEntity){
            alunoList.add(aluno)
        }

        fun getAlunos(): List<AlunoEntity>{
            return alunoList
        }


    }
}