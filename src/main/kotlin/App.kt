import io.jooby.Kooby
import io.jooby.OpenAPIModule
import io.jooby.runApp

class App: Kooby({
  val openAPIModule = OpenAPIModule()
  openAPIModule.swaggerUI("/apidocs")
  install(openAPIModule)

  val StaffRoleName = "staff"
  val CustomerRoleName = "customer"

  routes {
    decorator(RequireAnyGivenRole(StaffRoleName, CustomerRoleName))

    coroutine {
      mvc(Controller())
    }
  }

})

fun main(args: Array<String>) {
  runApp(args, App::class)
}
