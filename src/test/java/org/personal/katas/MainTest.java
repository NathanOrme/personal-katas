package org.personal.katas;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(SpringExtension.class)
class MainTest {

    @Test
    void main_WithDefaultValues_Runs() {
        assertDoesNotThrow(() -> MainApplication.main(null));
    }

}
