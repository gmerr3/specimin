package com.example;

import com.school.Department;

class Simple {
    Department math;
    Department bar() {
        // math is unsolved, but SpecSlice should not create a synthetic class for class Simple
        return this.math;
    }

}
