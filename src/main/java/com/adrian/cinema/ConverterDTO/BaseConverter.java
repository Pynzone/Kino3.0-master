package com.adrian.cinema.ConverterDTO;
import java.util.Collection;
import java.util.stream.Collectors;

@FunctionalInterface
public interface BaseConverter<F,T> {
    /*
     * Convert database object to DTO or DTO to database object
     * database object means entity(so class that are marked as @Entity)
     *
     * F-from
     * T-to
     */

    T convert(F from);

    default Collection<T> convertAll(Collection<F> fElements){
        Collection<T> convertedElement =
                fElements.stream()
                        .map(element -> convert(element))
                        .collect(Collectors.toList());

        return convertedElement;
    }
}
