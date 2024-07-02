package com.example.sorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sort")
@CrossOrigin(origins = "http://localhost:4200")
public class SortController {

    @Autowired
    private SortService sortService;

    @PostMapping("/bubble")
    public int[] bubbleSort(@RequestBody int[] numbers) {
        return sortService.bubbleSort(numbers);
    }
}
