import io.jooby.annotations.GET
import io.jooby.annotations.Path
import io.jooby.annotations.QueryParam
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import kotlinx.coroutines.*

@Path("/")
class Controller {

    @Operation(
            summary = "Values for single ID",
            description = "Delivers full data for an ID for a given year",
            parameters = [
                Parameter(
                        name = "year",
                        example = "2018",
                        description = "The year where the data will be retrieved",
                        required = true
                ),
                Parameter(
                        name = "id",
                        example = "XD12345",
                        description = "An ID value which belongs to a dataset",
                        required = true
                )

            ]
    )
    @GET
    suspend fun listDataForID(
            @QueryParam year: Int,
            @QueryParam id: String
    ): String {
        delay(1000L)
        return "Welcome to Jooby! Year=${year} and ID=${id}"
    }
}
