package netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LocalizationServiceImplTest {
    @Test
    void checkLocalRussian() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Location location = mock(Location.class);
        when(location.getCountry()).thenReturn(Country.RUSSIA);
        assertEquals("Добро пожаловать", localizationService.locale(location.getCountry()));

    }

    @Test
    void checkLocalEnglish() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Location location = mock(Location.class);
        when(location.getCountry()).thenReturn(Country.USA);
        assertEquals("Welcome", localizationService.locale(location.getCountry()));

    }
}