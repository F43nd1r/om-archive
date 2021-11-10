
solution {
    puzzle = "P071"
    name = "NEW SOLUTION 4"
    arm(ARM6) {
        number = 1
        position = -1 to 1
        rotation = 1
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 5 to -1
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = 9 to -1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 12 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 12 to -4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 6 to -1
        rotation = 1
    }
    glyph(UNIFICATION) {
        position = 11 to -4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -4
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(1 to -2, 0 to -2, 1 to -3, 2 to -4, 3 to -5, 4 to -5, 5 to -5, 6 to -5, 7 to -5, 8 to -6, 9 to -7, 10 to -8, 11 to -9, 12 to -9, 13 to -9, 14 to -9, 15 to -10, 15 to -9, 16 to -10, 17 to -10, 17 to -9, 16 to -9, 15 to -8, 15 to -7, 15 to -6, 16 to -6, 16 to -5, 15 to -5, 14 to -4, 14 to -3, 13 to -3, 13 to -2, 14 to -2, 13 to -1, 12 to -1, 11 to -1, 10 to 0, 9 to 1, 9 to 0, 10 to -1, 9 to -1, 8 to -1, 8 to -2, 7 to -1, 7 to 0, 6 to 1, 6 to 0, 5 to 1, 5 to 2, 4 to 2, 4 to 1, 3 to 2, 3 to 3, 2 to 3, 1 to 4, 0 to 4, 1 to 3, 0 to 3, -1 to 4, -1 to 3, 0 to 2, 0 to 1, 0 to 0, 0 to -1)
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
                back()
                drop()
                back()
            }
        }
        )
    }
}
