
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"LController;", "", "()V", "listDataForID", "", "year", "", "id", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAPITEst"})
@io.jooby.annotations.Path(value = {"/"})
public final class Controller {
    
    @org.jetbrains.annotations.Nullable()
    @io.jooby.annotations.GET()
    @io.swagger.v3.oas.annotations.Operation(summary = "Values for single ID", description = "Delivers full data for an ID for a given year", parameters = {@io.swagger.v3.oas.annotations.Parameter(required = true, example = "2018", name = "year", description = "The year where the data will be retrieved"), @io.swagger.v3.oas.annotations.Parameter(required = true, example = "XD12345", name = "id", description = "An ID value which belongs to a dataset")})
    public final java.lang.Object listDataForID(@io.jooby.annotations.QueryParam()
    int year, @org.jetbrains.annotations.NotNull()
    @io.jooby.annotations.QueryParam()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    public Controller() {
        super();
    }
}