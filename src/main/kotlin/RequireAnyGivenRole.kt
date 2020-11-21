import io.jooby.Route
import io.jooby.StatusCode
import io.jooby.exception.StatusCodeException

class RequireAnyGivenRole(private vararg val allowedRoles: String) : Route.Decorator {
    override fun apply(next: Route.Handler): Route.Handler {
        return Route.Handler { ctx ->

            // dummy function just pass
            if (allowedRoles.any { true }) {
                next.apply(ctx)
            } else {
                throw StatusCodeException(StatusCode.FORBIDDEN)
            }
        }
    }
}