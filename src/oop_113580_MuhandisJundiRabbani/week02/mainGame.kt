package oop_113580_MuhandisJundiRabbani.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    println("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, baseDamage = damage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0){
        println("Pilih aksi (1: Serang, 2: Kabur): ")
        val action = scanner.nextInt()
        scanner.nextLine()

        if(action == 1){
            enemyHp -= hero.baseDamage

            if(enemyHp < 0){
                enemyHp = 0
            }

            println("Sisa HP musuh: $enemyHp")
            if(enemyHp > 0){
                val enemyDamage = (10..20).random()
                println("Musuh Membalas")
                hero.takeDamage(enemyDamage)
                println("Sisa Hp ${hero.name}: ${hero.hp}")
            }
        } else if(action == 2){
            println("Hero Kamu kabur wkwkwk")
            break
        } else {
            println("Ngaco, pilih 1 atau 2 aja!")
        }
        println()
    }

    println("=== Hasil Pertarungan ===")

    if(hero.isAlive() && enemyHp == 0){
        println("${hero.name} Menang!!!")
    } else if(!hero.isAlive() && enemyHp > 0){
        println("${hero.name} Kelah :(")
    } else{
        println("${hero.name} Kabur aokwokw")
    }

}

