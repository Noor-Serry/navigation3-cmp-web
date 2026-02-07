package karimolive.admin.dashboard

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform