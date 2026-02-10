package karimolive.admin.dashboard.components

import karimadmin.composeapp.generated.resources.Res
import karimadmin.composeapp.generated.resources.ic_add
import karimadmin.composeapp.generated.resources.ic_add_blog
import karimadmin.composeapp.generated.resources.ic_blog
import karimadmin.composeapp.generated.resources.ic_category
import karimadmin.composeapp.generated.resources.ic_products
import karimadmin.composeapp.generated.resources.ic_reviews
import karimadmin.composeapp.generated.resources.ic_user_reviews
import karimadmin.composeapp.generated.resources.sidebar_add_admin_review
import karimadmin.composeapp.generated.resources.sidebar_add_blog
import karimadmin.composeapp.generated.resources.sidebar_add_category
import karimadmin.composeapp.generated.resources.sidebar_add_product
import karimadmin.composeapp.generated.resources.sidebar_admin_reviews
import karimadmin.composeapp.generated.resources.sidebar_blogs
import karimadmin.composeapp.generated.resources.sidebar_categories
import karimadmin.composeapp.generated.resources.sidebar_dashboard
import karimadmin.composeapp.generated.resources.sidebar_products
import karimadmin.composeapp.generated.resources.sidebar_users_reviews
import karimolive.admin.dashboard.navigation.AppRoute
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

enum class SidebarItem(
    val labelId: StringResource,
    val icon: DrawableResource,
    val route: AppRoute
) {

    // ---------- Main ----------
    DASHBOARD(
        Res.string.sidebar_dashboard,
        Res.drawable.sidebar_dashboard,
        AppRoute.Dashboard
    ),

    CATEGORIES(
        Res.string.sidebar_categories,
        Res.drawable.ic_category,
        AppRoute.CategoryManagement
    ),

    ADD_CATEGORY(
        Res.string.sidebar_add_category,
        Res.drawable.ic_add,
        AppRoute.CategoryManagement
    ),

    PRODUCTS(
        Res.string.sidebar_products,
        Res.drawable.ic_products,
        AppRoute.Product.Management
    ),

    ADD_PRODUCT(
        Res.string.sidebar_add_product,
        Res.drawable.ic_add,
        AppRoute.Product.AddEdit()
    ),

    BLOGS(
        Res.string.sidebar_blogs,
        Res.drawable.ic_blog,
        AppRoute.Blog.Management
    ),
    ADD_BLOG(
        Res.string.sidebar_add_blog,
        Res.drawable.ic_add_blog,
        AppRoute.Blog.AddEdit()
    ),

    USERS_REVIEWS(
        Res.string.sidebar_users_reviews,
        Res.drawable.ic_user_reviews,
        AppRoute.Review.Management
    ),

    ADMIN_REVIEWS(
        Res.string.sidebar_admin_reviews,
        Res.drawable.ic_reviews,
        AppRoute.Review.Management
    ),

    ADD_ADMIN_REVIEW(Res.string.sidebar_add_admin_review,
        Res.drawable.ic_reviews,
        AppRoute.Review.Management)

}