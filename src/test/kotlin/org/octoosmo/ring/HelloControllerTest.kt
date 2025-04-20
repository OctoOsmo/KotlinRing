package org.octoosmo.ring

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(HelloController::class)
class HelloControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should return hello message`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Hello, welcome to Ring!"))
    }

    @Test
    fun `should return 404 for non-existent endpoint`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/non-existent-endpoint"))
            .andExpect(MockMvcResultMatchers.status().isNotFound)
    }
}