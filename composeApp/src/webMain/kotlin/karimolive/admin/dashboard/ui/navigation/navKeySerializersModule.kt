package karimolive.admin.dashboard.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
val navKeySerializersModule = SerializersModule {
    polymorphic(NavKey::class) {
        // ---------------- AppRoute ----------------
        subclass(AppRoute.Login::class, AppRoute.Login.serializer())
        subclass(AppRoute.Dashboard::class, AppRoute.Dashboard.serializer())
        subclass(AppRoute.CategoryManagement::class, AppRoute.CategoryManagement.serializer())

        // ---------------- Product ----------------
        subclass(AppRoute.Product.Management::class, AppRoute.Product.Management.serializer())
        subclass(AppRoute.Product.AddEdit::class, AppRoute.Product.AddEdit.serializer())

        // ---------------- Blog ----------------
        subclass(AppRoute.Blog.Management::class, AppRoute.Blog.Management.serializer())
        subclass(AppRoute.Blog.AddEdit::class, AppRoute.Blog.AddEdit.serializer())

        // ---------------- Review ----------------
        subclass(AppRoute.Review.Management::class, AppRoute.Review.Management.serializer())
        subclass(
            AppRoute.Review.AdminAddedManagement::class,
            AppRoute.Review.AdminAddedManagement.serializer()
        )
        subclass(AppRoute.Review.AddEdit::class, AppRoute.Review.AddEdit.serializer())
        subclass(
            AppRoute.Review.AddEditAdminAdded::class,
            AppRoute.Review.AddEditAdminAdded.serializer()
        )
    }
}