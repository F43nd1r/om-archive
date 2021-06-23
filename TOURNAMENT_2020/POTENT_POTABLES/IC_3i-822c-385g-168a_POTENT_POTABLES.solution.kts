
solution {
    puzzle = "w2501727721"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM2) {
        number = 1
        position = -7 to 4
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -9 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -13 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -8 to 2
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -10 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -12 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -13 to 8
        rotation = 4
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    track {
        position = -6 to 4
        positions = listOf(4 to 1, 5 to 1, 6 to 0, 6 to -1, 7 to -2, 7 to -3, 6 to -3, 5 to -3, 5 to -4, 4 to -4, 3 to -4, 2 to -4, 2 to -5, 2 to -6, 1 to -6, 0 to -5, -1 to -5, -2 to -5, -3 to -5, -4 to -5, -5 to -4, -6 to -4, -6 to -5, -7 to -5, -8 to -4, -8 to -3, -9 to -2, -9 to -1, -8 to -1, -8 to 0, -8 to 1, -8 to 2, -7 to 2, -6 to 1, -5 to 0, -4 to -1, -3 to -1, -2 to -1, -2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to 0, 2 to 1, 3 to 1, 4 to 0, 5 to 0)
    }
    tape {
        parallel(
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
