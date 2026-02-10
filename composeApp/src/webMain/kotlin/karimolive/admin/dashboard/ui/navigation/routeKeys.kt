package karimolive.admin.dashboard.navigation

import kotlinx.serialization.Serializable

import androidx.navigation3.runtime.NavKey

@Serializable
sealed interface AppRoute : NavKey {

    @Serializable
    data object Login : AppRoute

    /* ---------------- Dashboard ---------------- */
    @Serializable
    data object Dashboard : AppRoute

    /* ---------------- Categories ---------------- */
    @Serializable
    data object CategoryManagement : AppRoute

    /* ---------------- Products ---------------- */
    @Serializable
    sealed interface Product : AppRoute {

        @Serializable
        data object Management : Product

        @Serializable
        data class AddEdit(
            val productId: Int? = null
        ) : Product
    }

    /* ---------------- Blogs ---------------- */
    @Serializable
    sealed interface Blog : AppRoute {

        @Serializable
        data object Management : Blog

        @Serializable
        data class AddEdit(
            val blogId: Int? = null
        ) : Blog
    }

    /* ---------------- Reviews ---------------- */
    @Serializable
    sealed interface Review : AppRoute {

        @Serializable
        data object Management : Review

        @Serializable
        data object AdminAddedManagement : Review

        @Serializable
        data class AddEdit(
            val reviewId: Int? = null
        ) : Review

        @Serializable
        data class AddEditAdminAdded(
            val reviewId: Int? = null
        ) : Review
    }
}
