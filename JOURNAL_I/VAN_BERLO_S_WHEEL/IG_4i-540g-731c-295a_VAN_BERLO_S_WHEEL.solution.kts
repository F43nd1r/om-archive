
solution {
    puzzle = "P054"
    name = "NEW SOLUTION 7"
    arm(ARM6) {
        number = 1
        position = 0 to 4
        rotation = -3
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -2 to 2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -4 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -3 to 3
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = 4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    track {
        position = 0 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 1 to -1, 2 to -1, 2 to 0, 2 to 1, 3 to 0, 4 to -1, 3 to -1, 3 to -2, 4 to -2, 5 to -2, 6 to -2, 6 to -3, 7 to -4, 7 to -5, 6 to -5, 6 to -6, 5 to -6, 5 to -7, 4 to -7, 3 to -6, 2 to -6, 1 to -5, 0 to -5, 1 to -6, 0 to -6, 1 to -7, 1 to -8, 0 to -7, -1 to -7, 0 to -8, -1 to -8, -2 to -8, -3 to -8, -3 to -7, -4 to -6, -5 to -5, -6 to -4, -6 to -3, -7 to -2, -8 to -1, -8 to 0, -7 to -1, -7 to 0, -8 to 1, -8 to 2, -8 to 3, -7 to 3, -6 to 3, -5 to 3, -5 to 4, -4 to 4, -3 to 4, -4 to 5, -3 to 5, -2 to 4, -2 to 3, -1 to 2, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
        
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
