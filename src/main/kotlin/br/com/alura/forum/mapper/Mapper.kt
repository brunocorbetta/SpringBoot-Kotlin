package br.com.alura.forum.mapper

import br.com.alura.forum.model.Topico

interface Mapper<T, U> {
    fun map(t: T): U
}