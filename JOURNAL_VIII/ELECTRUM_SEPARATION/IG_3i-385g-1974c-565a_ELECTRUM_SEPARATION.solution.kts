
solution {
    puzzle = "P103"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = 5 to 1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 6
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 6
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to 9
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 9
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 6
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 11 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 7 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 4 to 6
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = 12 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 8 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 13 to 0
        rotation = -2
    }
    track {
        position = 5 to 1
        positions = listOf(1 to -4, 2 to -4, 3 to -4, 4 to -4, 5 to -4, 6 to -4, 7 to -4, 6 to -3, 5 to -3, 4 to -3, 3 to -3, 2 to -2, 1 to -2, 0 to -1, 0 to 0, -1 to 1, -2 to 2, -3 to 2, -3 to 1, -4 to 1, -4 to 0, -5 to 0, -5 to -1, -5 to -2, -6 to -2, -7 to -2, -8 to -2, -7 to -3, -6 to -4, -6 to -5, -5 to -5, -4 to -5, -3 to -5, -2 to -5, -1 to -5, 0 to -5, 1 to -5)
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
