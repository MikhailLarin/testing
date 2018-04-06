package ru.dshcherbakov.web.json;

import org.apiguardian.api.API;
import org.junit.jupiter.params.provider.ArgumentsSource;
import ru.dshcherbakov.web.json.JsonArgumentsProvider;

import java.lang.annotation.*;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(status = EXPERIMENTAL, since = "5.0")
@ArgumentsSource(JsonArgumentsProvider.class)
public @interface JsonSource {
    String[] value();
    Class<?> type();
}
