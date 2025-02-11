package org.example.pickimagefromgallerykmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform