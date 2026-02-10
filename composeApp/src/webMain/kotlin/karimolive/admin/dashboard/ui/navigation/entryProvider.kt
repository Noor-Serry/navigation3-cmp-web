package karimolive.admin.dashboard.navigation

import androidx.compose.material3.Text
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider

val appEntryProvider : (NavKey) -> NavEntry<NavKey> = entryProvider {
        // ---------------- Login ----------------
        entry<AppRoute.Login> {
            Text("Login Screen")
        }
        // ---------------- Dashboard ----------------
        entry<AppRoute.Dashboard> {
            Text("Dashboard Screen")
        }

        // ---------------- Category Management ----------------
        entry<AppRoute.CategoryManagement> {
            Text("Category Management Screen")
        }

        // ---------------- Product ----------------
        entry<AppRoute.Product.Management> {
            Text("Product Management Screen")
        }
        entry<AppRoute.Product.AddEdit> { key ->
            Text("Product Add/Edit Screen - ID: ${key.productId ?: "New"}")
        }

        // ---------------- Blog ----------------
        entry<AppRoute.Blog.Management> {
            Text("Blog Management Screen")
        }
        entry<AppRoute.Blog.AddEdit> { key ->
            Text("Blog Add/Edit Screen - ID: ${key.blogId ?: "New"}")
        }

        // ---------------- Review ----------------
        entry<AppRoute.Review.Management> {
            Text("Review Management Screen")
        }
        entry<AppRoute.Review.AdminAddedManagement> {
            Text("Admin Added Review Management Screen")
        }
        entry<AppRoute.Review.AddEdit> { key ->
            Text("Review Add/Edit Screen - ID: ${key.reviewId ?: "New"}")
        }
        entry<AppRoute.Review.AddEditAdminAdded> { key ->
            Text("Review Add/Edit Admin Added Screen - ID: ${key.reviewId ?: "New"}")
        }
}
