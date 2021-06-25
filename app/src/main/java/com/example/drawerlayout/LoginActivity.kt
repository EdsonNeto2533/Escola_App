package com.example.drawerlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.drawerlayout.Entity.AlunoEntity
import com.example.drawerlayout.Repository.AlunoRepository
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }


    fun realizarLogin() {
        val mat = etMat.text.toString().toInt()
        val senha = etSenha.text.toString()
        val aux = AlunoRepository.getAlunos()

        //valida campos preenchidos
        if (mat.equals("") || senha.equals("")) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
        } else {
            //percorre a lista de pessoas em busca do usuario informado e se encontrado realiza o login
            for (i in aux.withIndex()) {
                if (i.value.mat == mat && i.value.senha == senha) {
                    Toast.makeText(this, "Seja bem vindo ${i.value.nome}", Toast.LENGTH_SHORT)
                        .show()
                    val inti = Intent(this, MainActivity::class.java)
                    startActivity(inti)
                } else {
                    Toast.makeText(this, "Usuario não encontrado", Toast.LENGTH_SHORT).show()
                }

            }

        }
    }
}