
solution {
    puzzle = "P055"
    name = "NEW SOLUTION 6"
    arm(ARM6) {
        number = 1
        position = 6 to -3
        rotation = 0
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 8 to -6
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -4 to 3
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 9 to -5
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 5 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 2 to -2
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -5 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 10 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 0
        rotation = 0
    }
    track {
        position = 6 to -3
        positions = listOf(0 to 0, -1 to 1, -1 to 2, 0 to 2, 0 to 3, -1 to 3, -2 to 4, -2 to 5, -3 to 6, -3 to 5, -4 to 6, -5 to 6, -6 to 6, -7 to 6, -8 to 7, -9 to 8, -10 to 8, -10 to 9, -11 to 9, -11 to 10, -12 to 10, -13 to 10, -13 to 9, -14 to 10, -14 to 9, -13 to 8, -13 to 7, -14 to 7, -14 to 6, -13 to 6, -13 to 5, -12 to 5, -11 to 4, -12 to 4, -11 to 3, -10 to 3, -10 to 4, -9 to 3, -8 to 2, -7 to 1, -8 to 1, -9 to 1, -9 to 2, -10 to 2, -10 to 1, -10 to 0, -9 to 0, -9 to -1, -10 to -1, -10 to -2, -9 to -2, -8 to -3, -9 to -3, -8 to -4, -7 to -5, -6 to -6, -6 to -5, -5 to -5, -6 to -4, -5 to -4, -5 to -3, -4 to -3, -5 to -2, -4 to -2, -3 to -3, -2 to -3, -3 to -2, -2 to -2, -2 to -1, -1 to -1, -2 to 0, -1 to 0)
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
