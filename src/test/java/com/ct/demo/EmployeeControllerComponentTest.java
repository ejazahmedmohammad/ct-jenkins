package com.ct.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerComponentTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInsertEmployee() throws Exception {
        // Arrange
        String requestBody = "{ \"name\": \"John Doe\"}";

        // Act
        mockMvc.perform(MockMvcRequestBuilders.post("/insert")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk());

        // Assert
        // You may add assertions here to check the state of the system after the HTTP request
        // For example, you might call the real repository to check if the employee was inserted
        // assertThat(employeeRepository.findById(1)).isPresent();
    }
}
