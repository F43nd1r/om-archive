
solution {
    puzzle = "P024"
    name = "INSTRUCTIONS 8"
    arm(ARM6) {
        number = 1
        position = -7 to -3
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -3 to -3
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = -5 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -4 to -3
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -2 to -3
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -6 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -1 to -3
        rotation = 0
    }
    track {
        position = -9 to -3
        positions = listOf(2 to 0, 3 to -1, 4 to -1, 5 to -2, 6 to -3, 7 to -3, 8 to -3, 9 to -3, 9 to -2, 9 to -1, 9 to 0, 8 to 1, 7 to 2, 6 to 2, 5 to 2, 4 to 2, 3 to 3, 2 to 4, 1 to 4, 0 to 4, 0 to 3, -1 to 3, -1 to 2, -1 to 1, 0 to 0, 1 to -1, 2 to -1)
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
            }
        }
        )
    }
}
