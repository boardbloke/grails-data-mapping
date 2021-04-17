package grails.gorm.time

import groovy.transform.CompileStatic
import groovy.transform.Generated

import java.time.*

/**
 * A trait to convert a {@link LocalDate} to and from a long
 *
 * @author James Kleeh
 */
@CompileStatic
trait LocalDateConverter extends TemporalConverter<LocalDate> {

    @Override
    @Generated
    Long convert(LocalDate value) {
        LocalDateTime localDateTime = LocalDateTime.of(value, LocalTime.MIN)
        localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli()
    }

    @Override
    @Generated
    LocalDate convert(Long value) {
        Instant instant = Instant.ofEpochMilli(value)
        LocalDateTime.ofInstant(instant, ZoneId.of('UTC')).toLocalDate()
    }
}